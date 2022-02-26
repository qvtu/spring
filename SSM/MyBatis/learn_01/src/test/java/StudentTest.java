import com.rzhylj.dao.StudentDAO;
import com.rzhylj.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: kkoo
 * Date: 2022/2/26 7:13 PM
 * FileName: StudentTest
 */
public class StudentTest {
    @Test
    public void searchStu() {
        SqlSession sqlSession = null;
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession();
            StudentDAO userDao = sqlSession.getMapper(StudentDAO.class);
            System.out.println("通过查询学生的id 获取学生的信息  返回值 Student");
            Student student = userDao.searchStu(1001);
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void searchCls() {
        SqlSession sqlSession = null;
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sqlSession = sqlSessionFactory.openSession();
            StudentDAO userDao = sqlSession.getMapper(StudentDAO.class);
            System.out.println("通过班级查询所有学生  返回值 list");
            List<Student> student = userDao.searchCls(1);
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
