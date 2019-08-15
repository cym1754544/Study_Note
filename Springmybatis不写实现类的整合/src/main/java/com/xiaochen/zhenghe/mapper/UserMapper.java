package com.xiaochen.zhenghe.mapper;

import com.xiaochen.zhenghe.domain.User;

import java.util.List;

public interface UserMapper {
     List<User> findAll();

     User findById(int id);

}
