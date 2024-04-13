package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lm.agriculture.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author lm
 * @create 2024-03-26 15:27
 */
public interface RoleMapper extends BaseMapper<Role> {
    @Select("select id from sys_role where flag = #{flag}")
    Integer selectByFlag(@Param("flag") String flag);
}
