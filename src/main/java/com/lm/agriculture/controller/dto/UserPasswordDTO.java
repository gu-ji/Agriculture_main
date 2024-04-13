package com.lm.agriculture.controller.dto;

import lombok.Data;

/**
 * @author lm
 * @create 2024-04-18 17:35
 */
@Data
public class UserPasswordDTO {
    private String adname;
    private String adpwd;
    private String newPassword;
}
