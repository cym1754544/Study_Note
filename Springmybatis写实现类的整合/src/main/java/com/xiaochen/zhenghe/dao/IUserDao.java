package com.xiaochen.zhenghe.dao;

import com.xiaochen.zhenghe.domain.User;

import java.util.List;

public interface IUserDao {
     List<User> findAll();

     User findById(int id);

}
