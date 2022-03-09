package com.rzhylj.mapper;

import com.rzhylj.entity.Student;

import java.util.List;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/9 0009 22:04
 * FileName: StudentMapper
 */
public interface StudentMapper {
    public List<Student> findStudentByNameOrJobs(Student student);

    public List<Student> findStudentById(Student student);
}
