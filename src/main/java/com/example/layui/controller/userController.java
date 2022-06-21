package com.example.layui.controller;

import com.example.layui.entity.User;
import com.example.layui.service.userService;
import com.example.layui.vo.Result;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;
    @PostMapping("/login")
    public Result login(User param, @RequestParam("captcha") String captcha, HttpServletRequest request ,HttpSession session){
        if (!CaptchaUtil.ver(captcha, request)) {
            CaptchaUtil.clear(request);  // 清除session中的验证码
            return Result.fail("验证码不正确");
        }
        User user = userService.login(param);
        if(user!=null){
            user.setPassword(null);
            session.setAttribute("userinfo",user);
            return Result.success();

        }else {return Result.fail("用户名或密码错误");}


    }
}
