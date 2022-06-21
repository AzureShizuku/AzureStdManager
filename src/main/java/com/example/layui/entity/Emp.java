package com.example.layui.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data

public class Emp implements Serializable {
    private Integer empId;
    private String name;
    private String sex;
    private Integer age;
    private Double sal;

    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date birthday;

    private String address;
    private Integer deptId;

    private Dept dept;

}
