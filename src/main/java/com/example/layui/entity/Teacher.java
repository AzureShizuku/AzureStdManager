package com.example.layui.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {
    private Integer teacherId;
    private String teacherName;
    private String sex;
    private Integer age;
    private String institute;
}
