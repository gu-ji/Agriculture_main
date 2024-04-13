package com.lm.agriculture.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lm.agriculture.entity.Foster;
import com.lm.agriculture.mapper.FosterMapper;
import com.lm.agriculture.service.IFosterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lm
 * @create 2024-04-17 17:39
 */
@Service
public class ForsterServiceImpl extends ServiceImpl<FosterMapper, Foster> implements IFosterService {

    @Resource private FosterMapper fosterMapper;

    @Override
    public Page<Foster> findPage(Page<Foster> page, String phone, String fosName, String startTime, String fosOper, String fosStatus) {
        return fosterMapper.findPage(page,phone, fosName, startTime, fosOper, fosStatus);

    }
}
