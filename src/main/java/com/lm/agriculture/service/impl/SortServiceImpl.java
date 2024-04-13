package com.lm.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lm.agriculture.entity.Product;
import com.lm.agriculture.entity.Sale;
import com.lm.agriculture.entity.Sort;
import com.lm.agriculture.mapper.ProductMapper;
import com.lm.agriculture.mapper.SortMapper;
import com.lm.agriculture.service.IProductService;
import com.lm.agriculture.service.ISortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lm
 * @create 2024-03-26 15:23
 */
@Service
public class SortServiceImpl extends ServiceImpl<SortMapper, Sort> implements ISortService {

    @Resource
    private SortMapper sortMapper;

    @Override
    public Page<Sort> findPage(Page<Sort> page, String sortname) {

        return sortMapper.findPage(page,sortname);
    }

    @Override
    public Page<Sort> findPage1(Page<Sort> page) {
        return sortMapper.findPage1(page);

    }
}
