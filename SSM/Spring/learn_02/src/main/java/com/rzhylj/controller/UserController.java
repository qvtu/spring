package com.rzhylj.controller;

import com.rzhylj.entity.User;
import com.rzhylj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/5 0005 17:36
 * @fileName: UserController
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public Map<String,Object> register(User user) {
       return userService.register(user);
    }
}
