package com.xiaochen.controller;

import com.xiaochen.bean.User;
import com.xiaochen.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/123")
    public void asd(){
        System.out.println("123");
    }

    @RequestMapping("/hello/{id}")
    public User findUserById(@PathVariable(name="id") int id){
        System.out.println("123");
        return userMapper.findUserById(id);
    }

}
