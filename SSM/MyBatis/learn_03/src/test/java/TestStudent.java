import com.rzhylj.entity.Student;
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
import java.util.List;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/9 0009 22:12
 * FileName: Test
 */
public class TestStudent {
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
        Student s1 = new Student();
        System.out.println("当用户输入的学生姓名不为空，则只根据学生姓名进行学生信息的查询；");
        s1.setName("小红");
        List<Student> students = studentMapper.findStudentByNameOrJobs(s1);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test02() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student s2 = new Student();
        System.out.println("当用户输入的学生姓名为空，而学生专业不为空，则只根据学生专业进行学生的查询；");
        s2.setProfessional("会计");
        List<Student> students = studentMapper.findStudentByNameOrJobs(s2);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test03() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student s3 = new Student();
        System.out.println("当用户输入的学生姓名和专业都为空，则要求查询出所有学号不为空的学生信息。");
        List<Student> students = studentMapper.findStudentByNameOrJobs(s3);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test04() {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student s4 = new Student();
        System.out.println("单条件查询查询出所有id值小于5的学生的信息。");
        s4.setId(5);
        List<Student> students = studentMapper.findStudentById(s4);
        for (Student student : students) {
            System.out.println(student);
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
