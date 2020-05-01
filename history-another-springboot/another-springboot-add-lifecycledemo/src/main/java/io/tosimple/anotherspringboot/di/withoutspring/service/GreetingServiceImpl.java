package io.tosimple.anotherspringboot.di.withoutspring.service;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
