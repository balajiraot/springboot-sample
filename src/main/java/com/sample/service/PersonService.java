package com.sample.service;

import com.sample.domain.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by bthum on 3/18/17.
 */
@Path("person")
@Api("Person service")

public interface PersonService {

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation("findAll")
    List<Person> findAll();

    @GET
    @ApiOperation(value = "findOne", produces = MediaType.APPLICATION_JSON)
    @Path("/{id}")
    Person find(@PathParam("id")Long id);

    @POST
    @Path("/")
    @ApiOperation(value = "create",consumes = MediaType.APPLICATION_JSON)
    Person create(Person p);
}
