package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public abstract class AbstractGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public abstract String hello();
}
