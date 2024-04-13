package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Outstorage;
import com.lm.agriculture.entity.Putstorage;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IOutService extends IService<Outstorage> {

    Page<Outstorage> findPage(Page<Outstorage> page, String outId, String outOper, String outCustomer,String startTime, String endTime);
    Page<Outstorage> findPage1(Page<Outstorage> page,String startTime, String endTime);
    Double sumByToday();
    Double sumByPaid();

    int saleValidate();


}
