package com.example.layui.service;

import com.example.layui.entity.Dept;
import com.example.layui.entity.Emp;
import com.example.layui.vo.EmpQuery;

import java.util.List;

public interface EmpService {
    List<Emp> getEmpList(EmpQuery param);

    Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);

    List<Dept> getAllDept();

    void deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);
}
