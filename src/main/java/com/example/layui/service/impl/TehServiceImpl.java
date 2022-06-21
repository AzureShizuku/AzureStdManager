package com.example.layui.service.impl;


import com.example.layui.entity.Teacher;
import com.example.layui.mapper.TehMapper;
import com.example.layui.service.TehService;
import com.example.layui.vo.EmpQuery;
import com.example.layui.vo.TehQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TehServiceImpl implements TehService {
    @Resource
    private TehMapper tehMapper;
    @Override
    public List<Teacher> getTehList(TehQuery param) {
        return tehMapper.getTehList(param);
    }

    @Override
    public Long countTehList(TehQuery param) {
        return tehMapper.countTehList(param);
    }

    @Override
    public void addTeh(Teacher teacher) {
        tehMapper.addTeh(teacher);
    }

    @Override
    public void deleteTehByIds(String ids) {
        tehMapper.deleteTehByIds(ids);
    }

    @Override
    public Teacher getTehById(Integer teacherId) {
        return tehMapper.getTehById(teacherId);
    }

    @Override
    public void updateTeh(Teacher teacher) {
        tehMapper.updateTeh(teacher);
    }
}
