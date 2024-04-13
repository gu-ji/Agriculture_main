package com.lm.agriculture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Buy;
import com.lm.agriculture.entity.Manager;
import com.lm.agriculture.entity.Putstorage;
import com.lm.agriculture.entity.Sale;

import java.util.Date;
import java.util.List;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface ISaleService extends IService<Sale> {

    Page<Sale> findPage(Page<Sale> page, String saleId);
    Page<Sale> findPage1(Page<Sale> page, String saleId,String saler, String reviewer,String results,String startTime,String endTime);
    Page<Sale> findPage2(Page<Sale> objectPage);
}
