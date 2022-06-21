package com.example.layui.mapper;

import com.example.layui.entity.Course;
import com.example.layui.entity.Teacher;
import com.example.layui.vo.TehQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TehMapper {
    List<Teacher> getTehList(TehQuery param);

    Long countTehList(TehQuery param);

    void addTeh(Teacher teacher);

    void deleteTehByIds(String ids);

    void updateTeh(Teacher teacher);

    Teacher getTehById(Integer teacherId);

    List<Course> getAllTeacher();
}
