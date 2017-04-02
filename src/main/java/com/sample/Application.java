package com.sample;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.sample.service.PersonService;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by bthum on 3/17/17.
 */

@SpringBootApplication
public class Application {

    @Autowired
    private Bus bus;

    @Autowired
    private PersonService personService;

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setAddress("/api/");
        endpoint.setServiceBeans(Arrays.<Object>asList(personService));
        endpoint.setProvider(new JacksonJsonProvider());

        endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
        return endpoint.create();
    }
}
