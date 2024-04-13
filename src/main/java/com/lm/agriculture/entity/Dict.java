package com.lm.agriculture.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lm
 * @create 2024-03-27 8:46
 */
@TableName("sys_dict")
@Data
public class Dict {
    private String name;
    private String value;
    private String type;
}
