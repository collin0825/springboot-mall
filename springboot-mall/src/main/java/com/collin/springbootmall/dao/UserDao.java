package com.collin.springbootmall.dao;

import com.collin.springbootmall.dto.UserRegisterRequest;
import com.collin.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
