package com.rzhylj.mapper.Impl;

import com.rzhylj.mapper.UserMapper;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/29 0029 14:11
 * FileName: UserDaoImpl
 */
public class UserMapperImpl implements UserMapper {
    @Override
    public boolean login(String name, String password) {
        if (name.equals("张三") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
