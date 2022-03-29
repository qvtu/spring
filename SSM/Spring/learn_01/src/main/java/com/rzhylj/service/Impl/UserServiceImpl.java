package com.rzhylj.service.Impl;

import com.rzhylj.dao.UserDAO;
import com.rzhylj.service.UserService;

/**
 * Copyright (C), 2019-2022, Kkoo
 * Author: Kkoo
 * Date: 2022/3/29 0029 14:15
 * FileName: UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean login(String name, String password) {
        return userDAO.login(name, password);
    }

}
