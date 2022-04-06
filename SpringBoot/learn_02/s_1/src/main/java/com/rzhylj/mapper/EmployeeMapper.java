package com.rzhylj.mapper;

import com.rzhylj.entity.Department;
import com.rzhylj.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/6 5:19 PM
 * @fileName: EmployeeMapper
 */
@Repository
public class EmployeeMapper {
    //模拟数据库
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentMapper departmentMapper;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "AA", "2kvi1381@usjh.com", 1, new Department(101, "教学部")));
        employees.put(1002, new Employee(1002, "AdA", "2hjdsgu1381@uqqh.com", 0, new Department(103, "生产部")));
        employees.put(1003, new Employee(1003, "r5A", "21381kckzxll@ush.com", 0, new Department(104, "运营部")));
        employees.put(1004, new Employee(1004, "fsaAA", "2141fjdshij81@ush.com", 1, new Department(101, "教学部")));
        employees.put(1005, new Employee(1005, "A5551aA", "2134wei1381@ush.com", 1, new Department(102, "市场部")));
    }

    private static Integer intiId = 1006;

    /**
     * @param employee 新增员工
     */
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(intiId++);
        }
        employee.setDepartment(departmentMapper.getDepartmentsById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll() {
        return employees.values();
    }

    /**
     * @param id
     * @return employee
     * 通过id查询员工
     */
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    /**
     * @param id 通过id删除员工
     */
    public void deleteById(Integer id) {
        employees.remove(id);
    }
}
