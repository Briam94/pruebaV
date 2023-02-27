package com.prueba.test.controller;

import com.prueba.test.dto.UserDto;
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

    @CrossOrigin(origins = "*")
    @GetMapping(Constans.FIND_ALL_USERS)
    public List<UserEntity> findAllUsers() {
        return userService.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(Constans.ADD_USER)
    public String addUser(@RequestBody UserDto newUser) {
        return userService.saveUser(newUser);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(Constans.LOGIN)
    public boolean login(@RequestBody UserDto user) {
        return userService.login(user);
    }
}
