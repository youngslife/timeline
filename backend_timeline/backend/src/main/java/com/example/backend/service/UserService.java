package com.example.backend.service;

import com.example.backend.entity.UserEntity;

public interface UserService {

    boolean registUser(UserEntity userEntity);

    boolean login(UserEntity userEntity);

}
