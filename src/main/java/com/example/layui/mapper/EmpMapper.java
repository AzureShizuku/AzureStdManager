package com.example.layui.mapper;

import com.example.layui.entity.Emp;
import com.example.layui.vo.EmpQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmpMapper {
     List<Emp> getEmpList(EmpQuery param);

     Long countEmpList(EmpQuery param);

    void addEmp(Emp emp);

    void deleteEmpByIds(String ids);

    Emp getEmpById(Integer id);

    void updateEmp(Emp emp);

    List<Emp> getAllEmp();

}
