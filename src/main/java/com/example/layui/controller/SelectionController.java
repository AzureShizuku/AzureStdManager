package com.example.layui.controller;

import com.example.layui.entity.Selection;
import com.example.layui.service.SelectionService;
import com.example.layui.vo.Result;
import com.example.layui.vo.SelectionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/selection")
public class SelectionController {
    @Autowired
    private SelectionService selectionService;
    @GetMapping("")
    public String toSelectionList(){
        return "selection/selectionList";
    }
    @RequestMapping("/list")
    @ResponseBody
    public Result<Object> getSelectionList(SelectionQuery param){
        List<Selection> list = selectionService.getSelectionList(param);
        System.out.println("adwadad"+list);

        Long count = selectionService.countSelectionList(param);
        return Result.success(list,count);
    }
    @PostMapping("")
    @ResponseBody
    public  Result<Object> addSelection(Selection selection){
        selectionService.addSelection(selection);
        return Result.success("新增成功");
    }
    @GetMapping("/add/ui")
    public String toAdd(Model model) {
        //model获取所有部门
        List<Selection> selectionList = selectionService.getAllSelection();
        model.addAttribute("selectionList", selectionList);
        return "selection/selectionAdd";
    }
    @DeleteMapping("/{ids}")
    @ResponseBody
    public Result<Object> deleteSelectionByIds(@PathVariable("ids") String ids) {
        selectionService.deleteSelectionByIds(ids);
        return Result.success("删除成功");
    }
    @GetMapping("/{id}")
    public String getSelectionById(@PathVariable("id") Integer id,Model model) {
        Selection selection = selectionService.getSelectionById(id);
        model.addAttribute("selection", selection);
        System.out.println("adwadad"+selection);
        model.addAttribute("courseList", selectionService.getAllCourse());
        model.addAttribute("empList", selectionService.getAllEmp());
        return "selection/selectionEdit";
    }
    @PutMapping("")
    @ResponseBody
    public Result<Object> updateSelection(Selection selection){
        selectionService.updateSelection(selection);
        return Result.success("修改成功");
    }







}
