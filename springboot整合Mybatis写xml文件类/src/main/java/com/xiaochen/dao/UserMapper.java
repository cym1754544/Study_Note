package com.xiaochen.dao;

import com.xiaochen.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {

    public User findUserById(int id);
}
