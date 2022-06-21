package com.example.layui.mapper;

import com.example.layui.entity.Course;
import com.example.layui.vo.CourseQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CourseMapper {
    List<Course> getCourseList(CourseQuery param);

    Long countCourseList(CourseQuery param);

    void addCourse(Course course);

    void deleteCourseByIds(String ids);

    Course getCourseById(Integer id);

    void updateCourse(Course course);


    List<Course> getAllCourse();
}
