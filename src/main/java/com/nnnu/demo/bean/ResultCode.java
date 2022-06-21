package com.nnnu.demo.bean;

public enum ResultCode {
    SUCCESS_CODE(true,200,"请求成功"),
    UNSUCCESS_CODE(false,400,"请求失败");
    private final Integer code;
    private final boolean flage;
    private final String msg;

    ResultCode(boolean flage,int code, String msg) {
        this.flage=flage;
        this.code=code;
        this.msg=msg;
    }

    public boolean getFlage() {
        return flage;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
