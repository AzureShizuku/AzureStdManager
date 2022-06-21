package com.example.layui.service.impl;

import com.example.layui.entity.User;
import com.example.layui.mapper.UserMapper;
import com.example.layui.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userImpl implements userService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.getUser(user);
    }
}

