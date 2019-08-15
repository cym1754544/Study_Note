package com.xiaochen.zhenghe.dao;

import com.xiaochen.zhenghe.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//继承SqlSessionDaoSupport,使用getSqlsession方法来获取Session
public class UserImpl extends SqlSessionDaoSupport implements IUserDao {

    @Override
    public List<User> findAll() {
        return this.getSqlSession().selectList("User.findAll");
    }

    @Override
    public User findById(int id) {
        return this.getSqlSession().selectOne("User.findById",id);
    }

}
