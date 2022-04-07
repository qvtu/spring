package com.rzhyl.mapper;

import com.rzhyl.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/7 11:53 PM
 * @fileName: StudentMapper
 */
@Mapper
@Repository
public interface StudentMapper {
    List<Student> queryStudentList();

    Student queryStudentById(Integer id);

    int addStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(Integer id);
}
