package com.prueba.test.controller;

import com.prueba.test.dto.LoginDto;
import com.prueba.test.entity.UserEntity;
import com.prueba.test.service.UserServiceInterface;
import com.prueba.test.utils.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constans.USERS)
public class UserController {

    @Autowired
    private UserServiceInterface userService;

    @GetMapping(Constans.FIND_ALL_USERS)
    public List<UserEntity> findAllUsers() {
        return userService.findAll();
    }

    @PostMapping(Constans.ADD_USER)
    public String addUser(@RequestBody UserEntity newUser) {
        return userService.saveUser(newUser);
    }

    @PostMapping()
    public boolean login(@RequestBody LoginDto login) {
        return userService.login(login);
    }
}
