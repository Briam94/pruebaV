package com.prueba.test.service;

import com.prueba.test.dto.PersonDto;
import com.prueba.test.entity.PersonEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonServiceInterface {

    public List<PersonEntity> findAll();
    public String createPerson(PersonDto person);
}
