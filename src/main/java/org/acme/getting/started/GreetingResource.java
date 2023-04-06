package org.acme.getting.started;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    public String greeting(String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }


    @GET
    @Path("/findAllNamedQuery")
    public List<GreetingEntity> findAllNamedget() {
        return entityManager.createNamedQuery( "findAll", GreetingEntity.class )
                            .getResultList();
    }

    @GET
    @Path("/findAllQuery")
    public List<GreetingEntity> findAllget() {
        return entityManager.createQuery( "SELECT g FROM GreetingEntity g ORDER BY g.name", GreetingEntity.class )
                            .getResultList();
    }

}