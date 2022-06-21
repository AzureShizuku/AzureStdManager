package com.example.layui.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    //重写addViewControllers方法，注册自定义的拦截器
    @Autowired
    @Qualifier(value = "loginIntercepter")
    private HandlerInterceptor handlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(handlerInterceptor);

        //拦截所有请求，通过判断是否有@LoginRequired注解来进行是否需要登录的验证
        interceptorRegistration.addPathPatterns("/**");
        //放行的请求
        interceptorRegistration.excludePathPatterns("/user/login","/user/register","/user/check","/user/logout",
                "/layui/**","/lib/**","/webjars/**","/login","/captcha","/user/index","api/**","css/**","js/**","images/**",
                "/welcome");
    }



}
