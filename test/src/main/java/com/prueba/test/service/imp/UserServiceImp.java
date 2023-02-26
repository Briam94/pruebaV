package com.prueba.test.service.imp;

import com.prueba.test.dto.LoginDto;
import com.prueba.test.entity.UserEntity;
import com.prueba.test.repository.UserRepository;
import com.prueba.test.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    public String saveUser(UserEntity user) {
        return null;
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public boolean login(LoginDto login) {
        try {
            UserEntity user = userRepository.findByUserPass(login.getUser(), login.getPassword());
            if(user != null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
