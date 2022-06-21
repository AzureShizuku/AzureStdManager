package com.example.layui.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Page implements Serializable {
    private Integer page;
    private Integer limit;
    public Long getStart() {
        return (page-1L)*limit;
    }

}
