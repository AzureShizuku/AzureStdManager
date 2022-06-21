package com.example.layui.service.impl;

import com.example.layui.entity.Course;
import com.example.layui.entity.Emp;
import com.example.layui.entity.Selection;
import com.example.layui.mapper.CourseMapper;
import com.example.layui.mapper.EmpMapper;
import com.example.layui.mapper.selectionMapper;
import com.example.layui.service.SelectionService;
import com.example.layui.vo.SelectionQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SelectionServiceimpl implements SelectionService {
@Resource
private selectionMapper selectionMapper;
@Resource
private CourseMapper courseMapper;
@Resource
private EmpMapper empMapper;
    @Override
    public Long countSelectionList(SelectionQuery param) {
        return selectionMapper.countSelectionList(param);


    }

    @Override
    public List<Selection> getSelectionList(SelectionQuery param) {

        return selectionMapper.getSelectionList(param);
    }

    @Override
    public void addSelection(Selection selection) {
        selectionMapper.addSelection(selection);

    }

    @Override
    public List<Selection> getAllSelection() {
        return null;
    }

    @Override
    public void deleteSelectionByIds(String ids) {
        selectionMapper.deleteSelectionByIds(ids);
    }

    @Override
    public Selection getSelectionById(Integer id) {
        return selectionMapper.getSelectionById(id);
    }

    @Override
    public void updateSelection(Selection selection) {
        selectionMapper.updateSelection(selection);

    }

    @Override
    public List<Course> getAllCourse() {
        return courseMapper.getAllCourse();
    }

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }


}

