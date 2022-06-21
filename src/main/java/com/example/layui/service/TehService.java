package com.example.layui.service;


import com.example.layui.entity.Teacher;

import com.example.layui.vo.TehQuery;

import java.util.List;

public interface TehService {
    List<Teacher> getTehList(TehQuery param);

    Long countTehList(TehQuery param);

    void addTeh(Teacher teacher);

    void deleteTehByIds(String ids);

    Teacher getTehById(Integer teacherId);

    void updateTeh(Teacher teacher);
}
