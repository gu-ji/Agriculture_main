package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.controller.dto.ManagerDTO;
import com.lm.agriculture.controller.dto.UserPasswordDTO;
import com.lm.agriculture.entity.Manager;
import com.lm.agriculture.entity.Menu;
import com.lm.agriculture.entity.Sort;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-21 18:24
 */
public interface IManagerService extends IService<Manager> {
    ManagerDTO login(ManagerDTO managerDTO);
    void updatePassword(UserPasswordDTO userPasswordDTO);
    Page<Manager> findPage(Page<Manager> objectPage);
    Page<Manager> findPage1(Page<Manager> objectPage);
    Page<Manager> findPage2(Page<Manager> objectPage);



}
