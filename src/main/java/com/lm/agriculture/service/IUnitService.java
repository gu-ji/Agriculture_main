package com.lm.agriculture.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lm.agriculture.entity.Menu;
import com.lm.agriculture.entity.Unit;

import java.util.List;

/**
 * @author lm
 * @create 2024-03-26 15:24
 */
public interface IUnitService extends IService<Unit> {
    List<Unit> findUnits(String unitname);
}
