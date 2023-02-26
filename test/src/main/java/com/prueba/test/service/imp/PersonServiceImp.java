package com.prueba.test.service.imp;

import com.prueba.test.entity.PersonEntity;
import com.prueba.test.repository.PersonRepository;
import com.prueba.test.service.PersonServiceInterface;
import com.prueba.test.utils.Constans;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceImp implements PersonServiceInterface {
    @Autowired
    private PersonRepository personRepository;

    public PersonServiceImp(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    public List<PersonEntity> findAll(){
        return personRepository.findAll();
    }

    public String createPerson(PersonEntity person) {
        try {
            personRepository.save(person);
            return Constans.SUCCESSFUL;
        } catch (Exception e) {
            return Constans.Error;
        }
    }
}
