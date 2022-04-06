package com.rzhylj.controller;

import com.rzhylj.entity.Department;
import com.rzhylj.entity.Employee;
import com.rzhylj.mapper.DepartmentMapper;
import com.rzhylj.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/6 7:38 PM
 * @fileName: EmployeeController
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/emps/list")
    @ResponseBody
    public Collection<Employee> empsList() {
        Collection<Employee> employees = employeeMapper.getAll();
        return employees;
    }

    @RequestMapping("/emp/list")
    @ResponseBody
    public Collection<Department> empList() {
        Collection<Department> departments = departmentMapper.getDepartments();
        return departments;
    }
    @RequestMapping("/emps/add")
    @ResponseBody
    public String addEmps(Employee employee){
        System.out.println(employee);
        employeeMapper.save(employee);
        return "成功";
    }
}
