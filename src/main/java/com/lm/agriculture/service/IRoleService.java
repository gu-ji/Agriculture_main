package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Role;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IRoleService extends IService<Role> {
    void setRoleMenu(Integer roleId, List<Integer> menuIds);

    List<Integer> getRoleMenu(Integer roleId);
}
