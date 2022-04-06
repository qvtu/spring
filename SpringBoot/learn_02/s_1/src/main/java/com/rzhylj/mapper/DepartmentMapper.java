package com.rzhylj.mapper;

import com.rzhylj.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/6 5:19 PM
 * @fileName: DepartmentMapper
 */
@Repository
public class DepartmentMapper {
    //模拟数据库
    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer, Department>();
        departments.put(101, new Department(101, "教学部"));
        departments.put(102, new Department(102, "市场部"));
        departments.put(103, new Department(103, "生产部"));
        departments.put(104, new Department(104, "运营部"));
        departments.put(105, new Department(105, "教研部"));
        departments.put(106, new Department(106, "后勤部"));
    }

    public Collection<Department> getDepartments() {
        return departments.values();
    }

    public Department getDepartmentsById(Integer id) {
        return departments.get(id);
    }
}
