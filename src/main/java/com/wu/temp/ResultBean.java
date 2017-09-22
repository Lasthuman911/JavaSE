package com.wu.temp;

import java.io.Serializable;

/**
 * 通用的返回接口
 * 为什么要返回统一的一个ResultBean：
 * 1.为了统一格式
 * 2.为了应用AOP
 * 3.为了包装异常信息
 * Created by zhiming.wu on 2017/9/19.
 */
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final int NO_LOGIN = -1;
    public static final int SUCCESS = 0;
    public static final int FAIL = 1;
    public static final int NO_PERMISSION = 2;
    private String msg="success";
    private int code = SUCCESS;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL ;
    }
}
