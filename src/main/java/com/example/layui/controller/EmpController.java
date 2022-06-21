package com.example.layui.controller;

import com.example.layui.entity.Dept;
import com.example.layui.entity.Emp;
import com.example.layui.service.EmpService;
import com.example.layui.vo.EmpQuery;
import com.example.layui.vo.Result;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("")
    public String toEmpList(){
        return "emp/empList";
    }
    @ResponseBody //返回json数据
    @GetMapping("/list")

    public Result<Object> getEmpList(EmpQuery param){

        List<Emp> list = empService.getEmpList(param);
        Long count = empService.countEmpList(param);
        return Result.success(list,count);
    }
    @PostMapping("")
    @ResponseBody
    public  Result<Object> addEmp(Emp emp){
        empService.addEmp(emp);
        return Result.success("新增成功");
    }
    @GetMapping("/add/ui")
    public String toAdd(Model model){
        //model获取所有部门
        List<Dept> deptList=empService.getAllDept();
        model.addAttribute("deptList", deptList);
        return "emp/empAdd";
    }
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteEmpByIds(@PathVariable("ids") String ids) {
        empService.deleteEmpByIds(ids);
        return Result.success("删除成功");
    }
    @GetMapping("/{id}")
    public String getEmpById(@PathVariable("id") Integer id,Model model) {
        Emp emp =empService.getEmpById(id);
        model.addAttribute("emp", emp);
        model.addAttribute("deptList", empService.getAllDept());
        return "emp/empEdit";
    }

    @PutMapping("")
    @ResponseBody
    public Result<Object> updateEmp(Emp emp){
        empService.updateEmp(emp);
        return Result.success("修改成功");
    }
}
