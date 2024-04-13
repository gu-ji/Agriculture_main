package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.*;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface ISortService extends IService<Sort> {

    Page<Sort> findPage(Page<Sort> objectPage, String sortname);
    Page<Sort> findPage1(Page<Sort> objectPage);

}
