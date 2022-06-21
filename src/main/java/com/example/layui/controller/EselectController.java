package com.example.layui.controller;

import com.example.layui.entity.Course;
import com.example.layui.entity.Emp;
import com.example.layui.entity.Selection;
import com.example.layui.service.CourseService;
import com.example.layui.service.EmpService;
import com.example.layui.service.EselectService;
import com.example.layui.service.SelectionService;
import com.example.layui.vo.CourseQuery;
import com.example.layui.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/eselect")
public class EselectController {
    @Autowired
    private EselectService eselectService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private EmpService empService;
    @Autowired
    private SelectionService selectionService;
    @GetMapping("")
    public String toEselectList(){
        return "eselect/eselectList";
    }
    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getEselectList(CourseQuery param){
        List<Course> list =  courseService.getCourseList(param);
        Long count =  courseService.countCourseList(param);
        return Result.success(list,count);
    }
    @GetMapping("/{id}")
    public String getEselectById(@PathVariable("id") Integer id, Model model) {
    List<Emp> empList = selectionService.getAllEmp();
    Course course = courseService.getCourseById(id);
    model.addAttribute("course", course);

    model.addAttribute("empList", empList);

        return "eselect/eselectAdd";
    }
    @PostMapping("")
    @ResponseBody
    public  Result<Object> addSelection(Selection selection){
        selectionService.addSelection(selection);
        return Result.success("新增成功");}
}
