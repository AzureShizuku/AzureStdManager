package com.example.layui.controller;


import com.example.layui.entity.Teacher;
import com.example.layui.service.TehService;
import com.example.layui.vo.Result;
import com.example.layui.vo.TehQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/teh")
public class TeacherController {
    @Autowired
    private TehService tehService;
    @GetMapping("")
    public String toTehList(){
        return "teh/tehList";
    }
    @ResponseBody
    @GetMapping("/tehList")
    public Result<Object> getTehList(TehQuery param){

        List<Teacher> list = tehService.getTehList(param);
        Long count = tehService.countTehList(param);
        return Result.success(list,count);
    }
    @PostMapping("")
    @ResponseBody
    public Result<Object> addTeh(Teacher teacher){
        tehService.addTeh(teacher);
        return Result.success("新增老师成功");
    }
    @GetMapping("/add/ui")
    public String toAddTeh(){
        return "teh/tehAdd";
    }
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteEmpByIds(@PathVariable("ids") String ids) {
        tehService.deleteTehByIds(ids);
        return Result.success("删除成功");}
    @GetMapping("/{teacherId}")
    public String getTehById(@PathVariable("teacherId") Integer teacherId, Model model) {
        Teacher teh =tehService.getTehById(teacherId);
        System.out.println("itiswaddddddddddddddddddddddddddddddddddd"+teh);
        model.addAttribute("teh", teh);

        return "teh/tehEdit";
    }
    @PutMapping("")
    @ResponseBody
    public Result<Object> updateTeh(Teacher teacher){
        tehService.updateTeh(teacher);
        return Result.success("修改成功");
    }
}
