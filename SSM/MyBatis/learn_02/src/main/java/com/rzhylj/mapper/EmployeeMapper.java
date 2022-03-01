package com.rzhylj.mapper;

import com.rzhylj.entity.Employee;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/1 0001 12:38
 * FileName: EmployeeMapper
 */
public interface EmployeeMapper {

    /**
     * 根据id查询员工信息
     *
     * @param id
     * @return
     */
    public Employee findEmployeeById(Integer id);

    /**
     * 新增员工信息
     *
     * @param employee
     * @return
     */
    public int addEmployee(Employee employee);

    /**
     * 根据id修改员工信息
     *
     * @param id
     * @param employee
     * @return
     */
    public int updateEmployeeById(Integer id, Employee employee);

    /**
     * 根据id删除员工信息
     *
     * @param id
     * @return
     */
    public int delEmployeeById(Integer id);

}
