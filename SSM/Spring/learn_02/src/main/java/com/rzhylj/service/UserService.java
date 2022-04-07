package com.rzhylj.service;

import com.rzhylj.entity.User;

import java.util.Map;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/5 0005 15:18
 * @fileName: UserService
 */
public interface UserService {
    Map<String,Object> login(String userName, String password);
    Map<String,Object> register(User user);
}
