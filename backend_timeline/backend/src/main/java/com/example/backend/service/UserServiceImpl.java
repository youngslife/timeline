package com.example.backend.service;

import com.example.backend.entity.UserEntity;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean registUser(UserEntity userEntity) {
        // 회원가입 성공 시 true
        boolean available = userRepository.existsByUsername(userEntity.getUsername());
        if (available) {
            // 이미 존재하므로 실패
            return false;
        }
        // 성공
        userRepository.save(userEntity);
        return true;
    }

    @Override
    public boolean login(UserEntity userEntity) {
        // 로그인 성공이면 true를 반환
        if (userRepository.existsByUser(userEntity.getUsername(), userEntity.getPassword()) !=null)
            return true;
        return false;
    }
}
