package com.rzhylj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @copyright (C), 2019-2022, Kkoo
 * @author: kkoo
 * @date: 2022/4/7 11:11 PM
 * @fileName: JDBCController
 */
@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询数据库的所有信息
    @GetMapping("buglist")
    public List<Map<String, Object>> buglist() {
        String sql = "select * from bug";
        List<Map<String, Object>> userlist = jdbcTemplate.queryForList(sql);
        return userlist;
    }
    @GetMapping("/addBug")
    public String addBug(){
        String sql = "insert into gokproject.bug(id,ip) values(123,'123.123.123.123')";
        jdbcTemplate.update(sql);
        return "update-ok";
    }
}
