package com.example.layui.service.impl;

import com.example.layui.entity.Course;
import com.example.layui.mapper.CourseMapper;
import com.example.layui.mapper.TehMapper;
import com.example.layui.service.CourseService;
import com.example.layui.vo.CourseQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServicelmpl implements CourseService {
@Resource
private CourseMapper courseMapper;
@Resource
private TehMapper tehMapper;

    @Override
    public List<Course> getCourseList(CourseQuery param) {
        return courseMapper.getCourseList(param);
    }

    @Override
    public Long countCourseList(CourseQuery param) {
        return courseMapper.countCourseList(param);
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.addCourse(course);
    }

    @Override
    public List<Course> getAllTeacher() {
        return tehMapper.getAllTeacher();
    }

    @Override
    public void deleteCourseByIds(String ids) {
        courseMapper.deleteCourseByIds(ids);
    }

    @Override
    public Course getCourseById(Integer id) {
        return courseMapper.getCourseById(id);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }
}
