package io.tosimple.anotherspringboot.di.withoutspring.controller;

import io.tosimple.anotherspringboot.di.withoutspring.service.GreetingService;

/**
 * example of Setter Injection
 */
public class SetterInjectedController {

    public GreetingService greetingService;

    /**
     * setter method (with any method name to set a class field
     * @param greetingService
     */
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
