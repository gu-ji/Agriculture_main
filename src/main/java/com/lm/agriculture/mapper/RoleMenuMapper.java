package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lm.agriculture.entity.Role;
import com.lm.agriculture.entity.RoleMenu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-26 15:27
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

    @Delete("delete from sys_role_menu where role_id = #{roleId}")
    int deleteByRoleId(@Param("roleId") Integer roleId);

    @Select("select menu_id from sys_role_menu where role_id = #{roleId}")
    List<Integer> selectByRoleId(@Param("roleId")Integer roleId);
}
