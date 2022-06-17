package com.nnnu.demo.bean;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object bean;
    private ResultCode result;

    public Result() {
    }

    public Result(ResultCode resultCode,Object bean) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.bean = bean;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public ResultCode getResult() {
        return result;
    }

    public void setResult(ResultCode result) {
        this.result = result;
    }
}




