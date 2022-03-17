import com.rzhylj.entity.Category;
import com.rzhylj.mapper.CategoryMapper;
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
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        System.out.println("查询商品类别为白色家电的商品的所有信息。");
        Category category = categoryMapper.findProductByTypename("白色家电");
        System.out.println(category);
    }

    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
