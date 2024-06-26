package com.lm.agriculture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lm.agriculture.entity.Sale;
import com.lm.agriculture.entity.Sort;
import org.apache.ibatis.annotations.Param;

/**
 * @author lm
 * @create 2024-03-26 15:27
 */
public interface SortMapper extends BaseMapper<Sort> {

     Page<Sort> findPage(Page<Sort> page, @Param("sortname") String sortname);

    Page<Sort> findPage1(Page<Sort> page);
}
