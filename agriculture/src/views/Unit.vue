<template>
  <div>
      <!-- http://localhost:8080/manager才能看到主界面 -->
          

      <div style="margin:10px 0">
        <el-input  type="text" suffix-icon="el-icon-search" style="width:200px" placeholder="请输入名称" v-model="unitname"></el-input>
        <el-button type="primary" class="ml-5" @click="load"  >搜索</el-button>
        <el-button type="warning"  @click="reset"  >重置</el-button>

      </div>

      <div style="margin:10px 0">
        <el-button type="primary" @click="handleAddMian">新增基础单位<i class="el-icon-circle-plus-outline"></i></el-button>

         <el-popconfirm
                class="ml-5"
                confirm-button-text='确定'
                cancel-button-text='我再想想'
                icon="el-icon-info"
                icon-color="red"
                title="您确定批量删除这新数据吗？"
                @confirm="delBatch"
            >
         <el-button type="danger" slot="reference">批量删除<i class="el-icon-remove-outline"></i></el-button>

                        </el-popconfirm>

                        <!-- <el-upload
                            action="http://localhost:9090/role/import" 
                            :show-file-list="false"
                             accept="xlsx" style="display:inline-block"
                             :on-success="handleExcelImportSuccess">
                           <el-button type="primary" class="ml-5">导入<i class="el-icon-bottom"></i></el-button>
                        </el-upload>
         <el-button type="primary" class="ml-5" @click="exp">导出<i class="el-icon-top"></i></el-button> -->
      </div>
      <el-table :data="tableData" border stripe row-key="unitsid" default-expand-all  :header-cell-class-name="'headerBg'"  @selection-change="handleSelectionChange">

         <el-table-column type="selection" width="55"></el-table-column>
        <el-table-column prop="unitsid" label="类别编号" width="80">
        </el-table-column>
        <el-table-column prop="unitname" label="类别名称" >
        </el-table-column>
        <el-table-column label="操作" width="300" align="center">
          <template slot-scope="scope">
            <!-- 当只有是管理员时才显示这个按钮 -->
            <!-- <el-button type="primary" @click="lookProduct(scope.row.products)" v-if="scope.row.role === 'ROLE_ADMIN'">查看此类农产品<i class="el-icon-edit"></i></el-button> -->
            <el-button type="primary" @click="handleAdd(scope.row.unitsid)"  v-if="!scope.row.unitpid " >新增子单位<i class="el-icon-plus"></i></el-button>

            <el-button type="success" @click="handleEdit(scope.row)">编辑<i class="el-icon-edit"></i></el-button>
            <el-popconfirm
                class="ml-5"
                confirm-button-text='确定'
                cancel-button-text='我再想想'
                icon="el-icon-info"
                icon-color="red"
                title="您确定删除吗？"
                @confirm="handleDel(scope.row.unitsid)"
            >
             <el-button type="danger" slot="reference">删除<i class="el-icon-remove-outline"></i></el-button>
            </el-popconfirm>
           
          </template>
        </el-table-column>
      </el-table>


    <!-- 弹窗1 -->
      <el-dialog title="新增或编辑单位类别信息" :visible.sync="dialogFormVisible" width="30%">
  <el-form :model="form" status-icon :rules="rules" ref="ruleForm"  label-width="90px" size="small" >
    <el-form-item  label="名称" prop="unitname" >
      <el-input v-model="form.unitname" autocomplete="off"></el-input>
    </el-form-item>


  </el-form>
  <div slot="footer" class="dialog-footer">
    <el-button @click="dialogFormVisible = false">取 消</el-button>
    <el-button type="primary" @click="save">确 定</el-button>
  </div>
</el-dialog>
  </div>
</template>

<script>
export default {
    name:"Unit",
    data() {

        return {
            tableData: [],
            pageNum:1,
            pageSize:5,
            unitname:"",
            products:[],
            dialogFormVisible:false ,
            vis:false,
              rules: {
                unitname: [ //与prop="supName"对应
                  { required: true, message: '名称不能为空', trigger: 'blur' },
                ]
                },
            // menuDialogVis:false,
            form:{} , //添加的弹出框
            multipleSelection:[],
             headerBg:'headerBg',
        }
    },
      created(){
    //请求分页查询数据
   this.load()
  },
    methods:{
      lookProduct(products){
        this.vis=true
        this.products=products
        

      },
         load(){
       //请求分页查询数据
       this.request.get("/unit", {
        params: {
            pageNum: this.pageNum,
          pageSize: this.pageSize,
          unitname: this.unitname,
         
        }
      }).then(res => {
        this.tableData = res.data
        console.log(this.total1)
      })

    },
     //保存数据
    save(){
      this.$refs['ruleForm'].validate((valid) => {
          if (valid) {//表单校验合法
      this.request.post("/unit",this.form).then(res =>{
        if(res.code === '200'){
          this.$message.success("保存成功")
           this.dialogFormVisible=false
           this.load()
        }else{
          this.$message.error("保存失败")
         }
      })}})
        
    },
      handleAddMian(){
     
      this.dialogFormVisible=true
      this.form={}
    
    },
     //新增弹窗
    handleAdd(unitpid){
      this.dialogFormVisible=true
      this.form={}
       if(unitpid){
        this.form.unitpid=unitpid
      }
    },
    //编辑
    handleEdit(row){
      this.form=JSON.parse(JSON.stringify(row))//可以解决编辑未确认就改变的问题
      this.dialogFormVisible=true
    },
    //删除
      handleDel(unitsid){
      this.request.delete("/unit/" + unitsid).then(res => {
         if(res.code === '200'){
          this.$message.success("删除成功")
           this.load()
        }else{
          this.$message.error("删除失败")
        }
      })},
    //批量选择
    handleSelectionChange(val){
      this.multipleSelection=val
    },
    //批量删除
    delBatch(){
      let unitsids = this.multipleSelection.map(v => v.unitsid) //[{},{},{}]=>[1,2,3]扁平化处理把一个对象数组变成纯id数组
       this.request.post("/unit/del/batch",unitsids).then(res => {
         if(res.code === '200'){
          this.$message.success("批量删除成功")
           this.load()
        }else{
          this.$message.error("批量删除失败")
        }
      })
    },
     //重置
    reset(){
      this.unitname=""
      this.load()
    },
    handleSizeChange(pageSize){
      this.pageSize=pageSize
      this.load()

    },
    handleCurrentChange(pageNum){
      this.pageNum=pageNum
      this.load()
    },
    }
    }

</script>

<style>
 
</style>