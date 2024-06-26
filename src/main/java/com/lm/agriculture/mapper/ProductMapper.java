package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lm.agriculture.entity.Product;
import com.lm.agriculture.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author lm
 * @create 2024-03-26 15:27
 */
public interface ProductMapper extends BaseMapper<Product> {
    Page<Product> findPage(Page<Product> page,@Param("name") String name,@Param("psort") String psort);
}
