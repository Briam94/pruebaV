package com.prueba.test.service.imp;

import com.prueba.test.dto.UserDto;
import com.prueba.test.entity.UserEntity;
import com.prueba.test.repository.UserRepository;
import com.prueba.test.service.UserServiceInterface;
import com.prueba.test.utils.Constans;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class UserServiceImp implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    public String saveUser(UserDto user) {
        try {
            UserEntity newUser = new UserEntity(null, new Date(), user.getPassword(), user.getUser());
            userRepository.save(newUser);
            return Constans.SUCCESSFUL;
        } catch (Exception e) {
            return Constans.Error;
        }
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public boolean login(UserDto userDto) {
        try {
            UserEntity user = userRepository.findByUserPass(userDto.getUser(), userDto.getPassword());
            if(user != null) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
