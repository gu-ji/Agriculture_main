package com.lm.agriculture.exception;

import lombok.Getter;

/**
 * @author lm
 * @create 2024-03-22 11:09
 */
/*
自定义异常
*/
@Getter
public class ServiceException extends RuntimeException {
    private String code;

    public ServiceException(String code,String msg){
        super(msg);
        this.code=code;
    }
}
