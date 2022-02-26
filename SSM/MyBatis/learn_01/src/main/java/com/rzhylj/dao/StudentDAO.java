package com.rzhylj.dao;

import com.rzhylj.entity.Student;

import java.util.List;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/2/26 11:14 PM
 * FileName: StudentDAO
 */
public interface StudentDAO {

    public Student searchStu(Integer stuId);

    public List<Student> searchCls(Integer stuCls);
}
