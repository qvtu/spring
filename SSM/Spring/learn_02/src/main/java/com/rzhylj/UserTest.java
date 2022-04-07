package com.rzhylj;

import com.rzhylj.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/5 0005 17:06
 * @fileName: UserTest
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
