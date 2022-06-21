package com.example.layui.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Selection implements Serializable {
    private Integer empId;
    private Integer courseId;
    private Integer grade;
    private Integer iid;
    private Emp emp;
    private Course course;
}
