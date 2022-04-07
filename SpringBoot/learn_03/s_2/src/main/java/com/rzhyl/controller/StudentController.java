package com.rzhyl.controller;

import com.rzhyl.entity.Student;
import com.rzhyl.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/8 1:11 AM
 * @fileName: StudentController
 */
@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/queryStudentList")
    private List<Student> queryStudentList() {
        List<Student> students = studentMapper.queryStudentList();
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }
}
