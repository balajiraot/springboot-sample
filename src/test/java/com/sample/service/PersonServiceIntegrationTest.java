package com.sample.service;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * Created by bthum on 3/19/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonServiceIntegrationTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Before()
    public void setup(){

    }

    @Test
    @Ignore
    public void testFindAll(){
        ResponseEntity<List> forEntity = restTemplate.getForEntity("/services/api/person/testFindAll", List.class);
        //Validate data here
    }




}
