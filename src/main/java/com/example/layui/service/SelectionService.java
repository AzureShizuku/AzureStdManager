package com.example.layui.service;

import com.example.layui.entity.Course;
import com.example.layui.entity.Emp;
import com.example.layui.entity.Selection;
import com.example.layui.vo.SelectionQuery;

import java.util.List;

public interface SelectionService {
    Long countSelectionList(SelectionQuery param);

    List<Selection> getSelectionList(SelectionQuery param);

    void addSelection(Selection selection);

    List<Selection> getAllSelection();

    void deleteSelectionByIds(String ids);

    Selection getSelectionById(Integer id);

    void updateSelection(Selection selection);


    List<Course> getAllCourse();

    List<Emp> getAllEmp();
}
