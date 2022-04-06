package com.rzhylj.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/6 6:30 PM
 * @fileName: EmployeeController
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    @ResponseBody
    public String login(HttpSession session, String username, String password) {
        if (username.equals("kkoo") && password.equals("123456")) {
            session.setAttribute("loginUser", username);
            return "OK";
        } else {
            return "NO";
        }
    }
}
