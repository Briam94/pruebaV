package com.prueba.test.service;

import com.prueba.test.dto.LoginDto;
import com.prueba.test.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserServiceInterface {

    public String saveUser(UserEntity user);

    public List<UserEntity> findAll();

    public boolean login(LoginDto login);
}
