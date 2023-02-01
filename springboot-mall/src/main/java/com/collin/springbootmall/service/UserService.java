package com.collin.springbootmall.service;

import com.collin.springbootmall.dto.UserRegisterRequest;
import com.collin.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
