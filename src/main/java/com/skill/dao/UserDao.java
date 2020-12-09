package com.skill.dao;

import com.skill.domain.User;

public interface UserDao {

    public User selectOne(Integer id);
}
