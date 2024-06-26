package com.lm.agriculture.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lm
 * @create 2024-03-28 10:36
 */
@TableName("fl_product")
@Data
public class Product {

    @ApiModelProperty("农产品编号")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("农产品名称")
    private String name;

    @ApiModelProperty("所属类别")
    private String psort;

    @ApiModelProperty("进价")
    private Double proCost;

    @ApiModelProperty("售价")
    private Double proPrice;

    @ApiModelProperty("库存")
    private Integer proStock;

    @ApiModelProperty("供应商")
    private String proFrom;

    @ApiModelProperty("销量")
    private Integer proSales;

    @TableField(exist = false)
    private String sort;
}
