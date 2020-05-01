package io.tosimple.anotherspringboot.di.withspring.controller;

import io.tosimple.anotherspringboot.di.withspring.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {
    public String sayHHello(){
        System.out.println("Hello World!!!");

        return "Hello folks!";
    }

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
