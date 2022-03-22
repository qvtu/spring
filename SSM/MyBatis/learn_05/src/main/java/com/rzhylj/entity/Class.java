package com.rzhylj.entity;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/3/22 10:39 AM
 * FileName: c_class
 */
public class Class {
    private Integer c_id;
    private String c_name;

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    @Override
    public String toString() {
        return "c_class{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                '}';
    }
}
