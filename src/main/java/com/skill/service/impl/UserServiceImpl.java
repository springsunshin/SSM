package com.skill.service.impl;

import com.skill.dao.UserDao;
import com.skill.domain.User;
import com.skill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectOne(Integer id) {
        return userDao.selectOne(id);
    }
}
