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
    @Select("select * from s_student where id =#{s_id}")
    @Results({
            @Result(id = true, property = "s_id", column = "id"),
            @Result(property = "s_name", column = "name"),
            @Result(property = "s_age", column = "age"),
            @Result(property = "s_cid", column = "cid")
    })
    Student findById(Integer id);

    @Select("select * from s_student where cid =#{s_cid}")
    @Results({
            @Result(id = true, property = "s_id", column = "id"),
            @Result(property = "s_name", column = "name"),
            @Result(property = "s_age", column = "age"),
            @Result(property = "s_cid", column = "cid")
    })
    Student findByCid(Integer s_cid);

    @Update("update s_student set name = #{s_name},age=#{s_age} where id = #{s_id}")
    int updateById(Student student);
}
