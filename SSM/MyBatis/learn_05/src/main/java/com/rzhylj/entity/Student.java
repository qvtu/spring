package com.rzhylj.entity;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/3/22 10:38 AM
 * FileName: s_student
 */
public class Student {
    private Integer s_id;
    private String s_name;
    private Integer s_age;
    private Integer s_cid;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Integer getS_age() {
        return s_age;
    }

    public void setS_age(Integer s_age) {
        this.s_age = s_age;
    }

    public Integer getS_cid() {
        return s_cid;
    }

    public void setS_cid(Integer s_cid) {
        this.s_cid = s_cid;
    }

    @Override
    public String toString() {
        return "s_student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_age=" + s_age +
                ", s_cid=" + s_cid +
                '}';
    }
}
