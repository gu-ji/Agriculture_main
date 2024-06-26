package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lm.agriculture.controller.dto.UserPasswordDTO;
import com.lm.agriculture.entity.Manager;
import com.lm.agriculture.entity.Sort;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-17 16:12
 */

public interface ManagerMapper extends BaseMapper<Manager> {
    Page<Manager> findPage(Page<Manager> page);
    Page<Manager> findPage1(Page<Manager> page);
    Page<Manager> findPage2(Page<Manager> page);

    @Update("update fl_admin set adpwd = #{newPassword} where adname = #{adname} and adpwd = #{adpwd}")
    int updatePassword(UserPasswordDTO userPasswordDTO);

}