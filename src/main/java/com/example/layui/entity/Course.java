package com.example.layui.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {
    private Integer courseId;
    private String courseName;
    private Integer credit;
    private Integer hours;
    private String location;
    private Integer capacity;
    private Integer teacherId;
    private Teacher teacher;

}
