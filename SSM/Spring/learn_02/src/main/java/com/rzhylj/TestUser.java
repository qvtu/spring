package com.rzhylj;

import com.rzhylj.controller.UserController;
import com.rzhylj.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/5 0005 17:45
 * @fileName: com.rzhylj.TestUser
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        User user = (User) applicationContext.getBean("user");
        Map<String, Object> map = userController.register(user);
        System.out.println(map);
    }
}
