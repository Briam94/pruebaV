package com.prueba.test.controller;

import com.prueba.test.dto.PersonDto;
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

    @CrossOrigin(origins = "*")
    @GetMapping(Constans.FIND_ALL_PERSON)
    public List<PersonEntity> findAllPersons() {
        return personService.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(Constans.ADD_PERSON)
    public String addUser(@RequestBody PersonDto newPerson) {
        return personService.createPerson(newPerson);
    }
}
