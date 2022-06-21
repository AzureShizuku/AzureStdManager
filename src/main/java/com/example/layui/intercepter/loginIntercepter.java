package com.example.layui.intercepter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
@Component
public class loginIntercepter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       Object user =request.getSession().getAttribute("userinfo");
       if(user==null){
           //没有登录
           log.debug("没有登录:"+request.getRequestURI());
           response.sendRedirect(request.getContextPath()+"/login");
           return false;

       }
       else {
           //已经登录
           log.debug("通过:"+request.getRequestURI());
           return true;

       }
    }
}
