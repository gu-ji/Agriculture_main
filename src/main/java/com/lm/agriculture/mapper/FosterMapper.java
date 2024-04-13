package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lm.agriculture.entity.Foster;

/**
 * @author lm
 * @create 2024-03-26 15:27
 */
public interface FosterMapper extends BaseMapper<Foster> {


    Page<Foster> findPage(Page<Foster> page, String phone, String fosName, String startTime, String fosOper, String fosStatus);
}
