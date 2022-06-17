package com.nnnu.demo.bean;

public enum ResultCode {
    SUCCESS_CODE(200,"请求成功"),
    UNSUCCESS_CODE(400,"请求失败");
    private Integer code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
