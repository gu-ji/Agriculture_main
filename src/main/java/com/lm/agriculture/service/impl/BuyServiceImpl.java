package com.lm.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lm.agriculture.entity.Buy;
import com.lm.agriculture.mapper.BuyMapper;
import com.lm.agriculture.service.IBuyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lm
 * @create 2024-03-26 15:23
 */
@Service
public class BuyServiceImpl extends ServiceImpl<BuyMapper, Buy> implements IBuyService {

    @Resource
    private BuyMapper buyMapper;


    @Override
    public Page<Buy> findPage(Page<Buy> page, String buyid,String buyApply,String buyer, String buyName,String buyStatus,String startTime,String endTime) {
        return buyMapper.findPage(page,buyid, buyApply, buyer, buyName, buyStatus, startTime, endTime);

    }

    @Override
    public Page<Buy> findPage1(Page<Buy> page) {
        return buyMapper.findPage1(page);

    }


}
