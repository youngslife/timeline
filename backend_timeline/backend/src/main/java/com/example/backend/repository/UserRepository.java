package com.example.backend.repository;

import com.example.backend.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    boolean existsByUsername(String username);

    @Query("SELECT user FROM UserEntity user WHERE user.username = ?1 AND user.password = ?2")
    UserEntity existsByUser(String username, String password);

}
