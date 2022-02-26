package com.rzhylj.entity;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/2/26 11:13 PM
 * FileName: Student
 */
public class Student {
    private String stuName;
    private Integer stuId;
    private Integer stuAge;
    private Integer stuCls;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuCls() {
        return stuCls;
    }

    public void setStuCls(Integer stuCls) {
        this.stuCls = stuCls;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", stuAge=" + stuAge +
                ", stuCls=" + stuCls +
                '}';
    }
}

