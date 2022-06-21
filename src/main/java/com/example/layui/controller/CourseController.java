package com.example.layui.controller;

import com.example.layui.entity.Course;
import com.example.layui.service.CourseService;
import com.example.layui.vo.CourseQuery;
import com.example.layui.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("")
    public String toCourseList(){
        return "course/courseList";
    }
    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getCourseList(CourseQuery param){
        List<Course> list = courseService.getCourseList(param);
        Long count = courseService.countCourseList(param);
        return Result.success(list,count);
    }
    @PostMapping("")
    @ResponseBody
    public  Result<Object> addCourse(Course course){
        courseService.addCourse(course);
        return Result.success("新增成功");
    }
    @GetMapping("/add/ui")
    public String toAdd(Model model){
        //model获取所有部门
        List<Course> teacherList=courseService.getAllTeacher();
        System.out.println("22ahdiauhduiagd"+teacherList);
        model.addAttribute("teacherList", teacherList);
        return "course/courseAdd";
    }
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteCourseByIds(@PathVariable("ids") String ids) {
        courseService.deleteCourseByIds(ids);
        return Result.success("删除成功");
    }
    @GetMapping("/{id}")
    public String getCourseById(@PathVariable("id") Integer id,Model model) {
        Course course = courseService.getCourseById(id);
        model.addAttribute("course", course);
        model.addAttribute("teacherList", courseService.getAllTeacher());
        return "course/courseEdit";
    }
    @PutMapping("")
    @ResponseBody
    public Result<Object> updateCourse(Course course){
        courseService.updateCourse(course);
        return Result.success("修改成功");
    }



}
