package com.example.layui.mapper;

import com.example.layui.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeptMapper {
    List<Dept> getAllDept();
}
