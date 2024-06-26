package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lm.agriculture.entity.Product;
import com.lm.agriculture.entity.Supplier;
import org.apache.ibatis.annotations.Param;

/**
 * @author lm
 * @create 2024-03-26 15:27
 */
public interface SupplierMapper extends BaseMapper<Supplier> {
     Page<Supplier> findPage(Page<Supplier> page, @Param("supName") String supName);
}
