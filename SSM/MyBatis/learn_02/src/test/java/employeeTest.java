import com.rzhylj.entity.Employee;
import com.rzhylj.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/3 0003 0:50
 * FileName: employeeTest
 */
public class employeeTest {
    SqlSession sqlSession = null;

    @Before
    public void before() {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void test01() {
        System.out.println("根据id查询员工信息");
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.findEmployeeById(2);
        System.out.println(employee);
    }

    @Test
    public void test02() {
        System.out.println("新增员工信息");
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee e1 = new Employee(null, "小明", 23, "员工");
        int num = employeeMapper.addEmployee(e1);
        if (num != 0) {
            System.out.println("成功添加");
        } else {
            System.out.println("添加失败");
        }
    }

    @Test
    public void test03() {
        System.out.println("根据id修改员工信息");
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee e1 = new Employee(1, "张三", 24, "董事长");
        int num = employeeMapper.updateEmployeeById(e1);
        if (num != 0) {
            System.out.println("修改添加");
        } else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void test04() {
        System.out.println("根据id删除员工信息");
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        int num = employeeMapper.delEmployeeById(2);
        if (num != 0) {
            System.out.println("删除添加");
        } else {
            System.out.println("删除失败");
        }
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
