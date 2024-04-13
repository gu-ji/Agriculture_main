package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Product;
import com.lm.agriculture.entity.Role;
import com.lm.agriculture.entity.Unit;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IProductService extends IService<Product> {

    Page<Product> findPage(Page<Product> page, String name,String psort);



}
