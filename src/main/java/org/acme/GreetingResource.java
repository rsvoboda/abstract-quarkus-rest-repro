package org.acme;

public class GreetingResource extends AbstractGreetingResource {
    @Override
    public String hello() {
        return "Hello from Quarkus REST";
    }
}
