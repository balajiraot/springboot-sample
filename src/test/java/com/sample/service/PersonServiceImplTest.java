package com.sample.service;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matcher.*;

import com.sample.domain.Person;
import com.sample.repository.PersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bthum on 3/19/17.
 */
public class PersonServiceImplTest {
    private PersonServiceImpl personService;
    private PersonRepository personRepository;

    @Before
    public void setup(){
        personService = new PersonServiceImpl();
        personRepository = mock(PersonRepository.class);
        personService.setPersonRepository(personRepository);
    }

    @Test
    public void testFineAllShouldReturnAllData()throws Exception {
        List<Person> expectedData = new ArrayList<>();
        Person p = new Person();
        p.setFirstName("testFirstName");
        p.setLastName("testLastName");
        p.setId(1L);
        expectedData.add(p);
        when(personRepository.findAll()).thenReturn(expectedData);
        List<Person> actualData = personService.findAll();
        Assert.assertEquals(actualData,expectedData);
        verify(personRepository).findAll();
    }

    @Test(expected = RuntimeException.class)
    public void testFindAllShouldThrowExceptionIfExceptionFromRepo()throws Exception {
        when(personRepository.findAll()).thenThrow(new RuntimeException());

        doThrow(new RuntimeException()).when(personRepository).findAll();
        personService.findAll();
    }



}
