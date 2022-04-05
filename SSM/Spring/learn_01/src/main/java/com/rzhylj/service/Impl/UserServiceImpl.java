package com.rzhylj.service.Impl;

import com.rzhylj.mapper.UserMapper;
import com.rzhylj.service.UserService;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/29 0029 14:15
 * FileName: UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String login(String name, String password) {
        boolean flag = userMapper.login(name, password);
        if (flag) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }
}
