package io.tosimple.anotherspringboot.di.withspring.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Primary Impl";
    }
}
