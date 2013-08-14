package com.matschaffer;

import com.google.inject.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class ExampleResource {
    @GET
    public String saySomething() {
        return "hello world";
    }
}