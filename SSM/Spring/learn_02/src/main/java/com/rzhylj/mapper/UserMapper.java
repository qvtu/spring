package com.rzhylj.mapper;

import com.rzhylj.entity.User;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/5 0005 15:17
 * @fileName: UserMapper
 */
public interface UserMapper {
    public User login(String userName);
    public int register(User user);
}
