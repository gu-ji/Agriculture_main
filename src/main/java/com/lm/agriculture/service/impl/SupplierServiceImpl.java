package com.lm.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lm.agriculture.entity.Supplier;
import com.lm.agriculture.mapper.SupplierMapper;
import com.lm.agriculture.service.ISupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lm
 * @create 2024-03-26 15:23
 */
@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements ISupplierService {

    @Resource
    private SupplierMapper supplierMapper;


    @Override
    public Page<Supplier> findPage(Page<Supplier> page, String supName) {
        return supplierMapper.findPage(page,supName);

    }
}
