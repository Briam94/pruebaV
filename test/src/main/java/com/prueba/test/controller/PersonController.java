package com.prueba.test.controller;

import com.prueba.test.entity.PersonEntity;
import com.prueba.test.service.PersonServiceInterface;
import com.prueba.test.service.imp.PersonServiceImp;
import com.prueba.test.utils.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonServiceImp personService;

    @GetMapping(Constans.FIND_ALL_PERSON)
    public List<PersonEntity> findAllPersons() {
        System.out.println("person");
        return personService.findAll();
    }
}
