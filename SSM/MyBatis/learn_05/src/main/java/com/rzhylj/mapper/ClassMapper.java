package com.rzhylj.mapper;

import com.rzhylj.entity.Cls;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/3/22 10:45 AM
 * FileName: c_classMapper
 */
public interface ClassMapper {
    @Select("select * from c_class where id = #{c_id}")
    @Results({
            @Result(id = true, property = "c_id", column = "id"),
            @Result(property = "c_name", column = "classname"),
            @Result(property = "studentList", column = "id", many = @Many(select = "com.rzhylj.mapper.StudentMapper.findByCid"))
    })
    Cls findStudentById(Integer c_id);
}
