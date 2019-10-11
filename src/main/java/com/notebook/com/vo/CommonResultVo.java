package com.notebook.com.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用response
 * @param <T>
 */
@Data
public class CommonResultVo<T> implements Serializable {

    private static final long serialVersionUID = -5672939670502706137L;
    private int code = 100;
    private String msg = "ok";
    private T result;

    public T getRecords(){
        return this.result;
    }
}
