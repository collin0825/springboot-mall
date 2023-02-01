package com.collin.springbootmall.service.impl;

import com.collin.springbootmall.dao.UserDao;
import com.collin.springbootmall.dto.UserRegisterRequest;
import com.collin.springbootmall.model.User;
import com.collin.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
