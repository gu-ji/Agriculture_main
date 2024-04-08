package com.lm.flowershop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lm
 * @create 2024-03-27 10:24
 */
@TableName("sys_role_menu")
@Data
public class RoleMenu {
    private Integer roleId;
    private Integer menuId;
}
