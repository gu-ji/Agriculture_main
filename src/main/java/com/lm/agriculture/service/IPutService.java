package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Putstorage;
import com.lm.agriculture.entity.Sale;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IPutService extends IService<Putstorage> {

    Page<Putstorage> findPage(Page<Putstorage> page, String putId,String putOper, String startTime,String endTime);
    Double sumByToday();
    int saleValidate();

}
