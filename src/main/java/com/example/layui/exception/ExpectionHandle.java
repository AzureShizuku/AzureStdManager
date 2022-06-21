package com.example.layui.exception;

import com.example.layui.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExpectionHandle {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result<Object> myHandler(Exception e){
        return Result.fail("系统错误: "+e.getMessage());
    }
}
