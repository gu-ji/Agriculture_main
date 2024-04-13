package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Menu;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IMenuService extends IService<Menu> {
    List<Menu> findMenus(String name);
}
