package com.example.layui.service;

import com.example.layui.entity.Course;
import com.example.layui.vo.CourseQuery;

import java.util.List;

public interface CourseService {
    List<Course> getCourseList(CourseQuery param);

    Long countCourseList(CourseQuery param);

    void addCourse(Course course);

    List<Course> getAllTeacher();

    void deleteCourseByIds(String ids);

    Course getCourseById(Integer id);

    void updateCourse(Course course);
}
