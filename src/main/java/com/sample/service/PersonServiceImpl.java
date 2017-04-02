package com.sample.service;

import com.sample.domain.Person;
import com.sample.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bthum on 3/18/17.
 */
@Service
public class PersonServiceImpl implements PersonService{
    Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person find(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public Person create(Person p) {
        try{
            return personRepository.save(p);
        }catch (Exception e){
            logger.error("Unable to save person", e);
            throw e;
        }
    }

    public PersonRepository getPersonRepository() {
        return personRepository;
    }

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
