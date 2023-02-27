package com.prueba.test.service;

import com.prueba.test.dto.UserDto;
import com.prueba.test.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserServiceInterface {

    public String saveUser(UserDto user);

    public List<UserEntity> findAll();

    public boolean login(UserDto login);
}
