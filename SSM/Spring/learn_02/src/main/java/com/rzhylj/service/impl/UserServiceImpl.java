package com.rzhylj.service.impl;

import com.rzhylj.entity.User;
import com.rzhylj.mapper.UserMapper;
import com.rzhylj.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/5 0005 15:18
 * @fileName: f
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    Map<String, Object> map = new HashMap<>();
    UserMapper userMapper;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Map<String, Object> login(String userName, String password) {
        User user = userMapper.login(userName);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                System.out.println("登录成功");
                map.put("user", user);
                map.put("code", 1001);
                map.put("message", "登录成功！");
            } else {
                System.out.println("密码错误");
                map.put("user", null);
                map.put("code", 1002);
                map.put("message", "密码错误，登录失败！");
            }
        } else {
            System.out.println("用户名不存在！");
            map.put("user", null);
            map.put("code", 1003);
            map.put("message", "用户名不存在！");
        }
        return map;
    }

    @Override
    public Map<String, Object> register(User user) {
        int flag = userMapper.register(user);
        if (flag == 1) {
            System.out.println("注册成功");
            map.put("user", user);
            map.put("code", 1001);
            map.put("message", "注册成功");
        } else {
            System.out.println("注册失败");
            map.put("userName", null);
            map.put("code", 1002);
            map.put("message", "注册失败");
        }
        return map;
    }
}
