package com.prueba.test.service.imp;

import com.prueba.test.entity.PersonEntity;
import com.prueba.test.repository.PersonRepository;
import com.prueba.test.service.PersonServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImp implements PersonServiceInterface {
    @Autowired
    private PersonRepository personRepository;

    public List<PersonEntity> findAll(){
        return personRepository.findAll();
    }
}
