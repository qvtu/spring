package com.rzhyl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/7 11:51 PM
 * @fileName: Student
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String stuName;
    private Integer stuId;
    private Integer stuAge;
    private Integer stuCls;
}
