package com.prueba.test.controller;

import com.prueba.test.entity.PersonEntity;
import com.prueba.test.service.PersonServiceInterface;
import com.prueba.test.utils.Constans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(Constans.PERSONS)
public class PersonController {

    @Autowired
    private PersonServiceInterface personService;

    @GetMapping(Constans.FIND_ALL_PERSON)
    public List<PersonEntity> findAllPersons() {
        return personService.findAll();
    }


    @PostMapping(Constans.ADD_PERSON)
    public String addUser(@RequestBody PersonEntity newPerson) {
        return personService.createPerson(newPerson);
    }
}
