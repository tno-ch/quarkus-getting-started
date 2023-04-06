package org.acme.getting.started;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;

@ApplicationScoped
public class GreetingService {

    //    @Inject
    //    @Any
    //    EntityManager em;

    @Inject
    EntityManager entityManager;

    public String greeting(String name) {

        System.out.println( "found entitymanager ==> " + ( entityManager != null ) + "\n" );
        return "hello " + name;
    }



}
