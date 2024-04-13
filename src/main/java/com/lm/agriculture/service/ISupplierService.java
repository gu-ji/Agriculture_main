package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Product;
import com.lm.agriculture.entity.Supplier;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface ISupplierService extends IService<Supplier> {

    Page<Supplier> findPage(Page<Supplier> page, String supName);
}
