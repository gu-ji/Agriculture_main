package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Buy;
import com.lm.agriculture.entity.Foster;
import com.lm.agriculture.entity.Sale;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IFosterService extends IService<Foster> {

    Page<Foster> findPage(Page<Foster> page, String phone,String fosName,String startTime,String fosOper,String fosStatus);

}
