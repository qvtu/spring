import com.rzhylj.entity.Cls;
import com.rzhylj.entity.Student;
import com.rzhylj.mapper.ClassMapper;
import com.rzhylj.mapper.StudentMapper;
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
 * Date: 2022/3/9 0009 22:12
 * FileName: Test
 */
public class TestDemo {
    SqlSession sqlSession = null;

    @Before
    public void before() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();

    }

    @Test
    public void test01() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.findById(2);
        System.out.println(student);
    }

    @Test
    public void test02() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student s1 = new Student();
        s1.setS_id(4);
        s1.setS_name("李雷");
        s1.setS_age(21);
        int flag = studentMapper.updateById(s1);
        if (flag == 1) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void test03() {
        ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
        Cls c = classMapper.findStudentById(2);
        System.out.println(c);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
