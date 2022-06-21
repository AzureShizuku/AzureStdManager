package com.example.layui.vo;

import lombok.Data;
import sun.applet.resources.MsgAppletViewer;


@Data


public class Result<T> {
    private Result (){}
    //全参构造器
    private Result(Integer code, String msg, T data,Long count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }
    private Integer code;//状态码，0为成功，-1为失败
    private String msg;//提示信息
    private T data;//数据
    private Long count;//总数(分页用)
    public static Result<Object> success() {
        return new Result(0,"success",null,null);
    }
    public static Result<Object> success(String msg) {
        return new Result(0,msg,null,null);
    }
    public static Result<Object> success(Object data,Long count) {
        return new Result(0,"success",data,count);
    }
    public static Result<Object> fail() {
        return new Result(-1,"fail",null,null);
    }
    public static Result<Object> fail(String msg) {
        return new Result(-1,msg,null,null);
    }
}
