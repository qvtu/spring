package com.rzhylj.entity;

import java.util.List;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/3/22 10:39 AM
 * FileName: c_class
 */
public class Cls {
    private Integer c_id;
    private String c_name;
    private List<Student> studentList;

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

    public List<Student> getStudents() {
        return studentList;
    }

    public void setStudents(List<Student> students) {
        this.studentList = students;
    }

    @Override
    public String toString() {
        return "Cls{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
