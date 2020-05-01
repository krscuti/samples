package io.tosimple.anotherspringboot.di.withspring.controller;

import io.tosimple.anotherspringboot.di.withspring.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * example of Setter Injection
 */
@Controller
public class SetterInjectedController {

    public GreetingService greetingService;

    /**
     * setter method (with any method name to set a class field
     * @param greetingService
     */
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
