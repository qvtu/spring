package com.rzhylj.mapper;

import com.rzhylj.entity.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/3/22 10:45 AM
 * FileName: s_studentMapper
 */
public interface StudentMapper {
    /**
     * 通过id查询学生的信息
     * @param id
     * @return
     */
    @Select("select * from s_student where id =#{s_id}")
    @Results({
            @Result(id = true, property = "s_id", column = "id"),
            @Result(property = "s_name", column = "name"),
            @Result(property = "s_age", column = "age"),
            @Result(property = "s_cid", column = "cid")
    })
    Student findById(Integer id);

    /**
     * 通过班级查询学生的信息
     * @param s_cid
     * @return
     */
    @Select("select * from s_student where cid =#{s_cid}")
    @Results({
            @Result(id = true, property = "s_id", column = "id"),
            @Result(property = "s_name", column = "name"),
            @Result(property = "s_age", column = "age"),
            @Result(property = "s_cid", column = "cid")
    })
    Student findByCid(Integer s_cid);

    /**
     * 通过id修改学生信息
     * @param student
     * @return
     */
    @Update("update s_student set name = #{s_name},age=#{s_age} where id = #{s_id}")
    int updateById(Student student);
}
