package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lm.agriculture.controller.dto.UserPasswordDTO;
import com.lm.agriculture.entity.Adminlogin;
import com.lm.agriculture.entity.Manager;
import org.apache.ibatis.annotations.Update;

/**
 * @author lm
 * @create 2024-03-17 16:12
 */

public interface AdminloginMapper extends BaseMapper<Adminlogin> {
}