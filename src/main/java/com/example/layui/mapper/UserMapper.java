package com.example.layui.mapper;

import com.example.layui.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface UserMapper {
    public User getUser(User user);

}
