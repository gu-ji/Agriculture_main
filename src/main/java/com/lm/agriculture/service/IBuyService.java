package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Buy;
import com.lm.agriculture.entity.Sale;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IBuyService extends IService<Buy> {

    Page<Buy> findPage(Page<Buy> page, String buyid ,String buyApply,String buyer,String buyName,String buyStatus,String startTime,String endTime);
    Page<Buy> findPage1(Page<Buy> objectPage);



}
