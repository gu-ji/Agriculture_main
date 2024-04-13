package com.lm.agriculture.controller.dto;

import com.lm.agriculture.entity.Menu;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author lm
 * @create 2024-03-21 18:01
 */
/*接收前端登录请求的参数*/
@Data
public class ManagerDTO {
    private String adname;
    private String adpwd;
    private Date createTime;
    private String avatarUrl;
    private String nikename;
    private String token;
    private String role;
    private List<Menu> menus;
}
