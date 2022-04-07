package com.rzhylj.mapper.impl;

import com.rzhylj.entity.User;
import com.rzhylj.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: Kkoo
 * @date: 2022/4/5 0005 15:16
 * @fileName: UserMapperImpl
 */
@Repository
public class UserMapperImpl implements UserMapper {

    @Override
    public User login(String userName) {
        System.out.println("执行查询语句：select * from t_user where username=?");
        User user = new User("张三", "123");
        return user;
    }

    @Override
    public int register(User user) {
        System.out.println("执行插入语句");
        int flag=1;
        return flag;
    }
}