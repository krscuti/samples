package io.tosimple.anotherspringboot.di.withoutspring.controller;

import io.tosimple.anotherspringboot.di.withoutspring.service.GreetingService;

/**
 * example of constructor Injection
 */
public class ConstructorInjectedController {

    /**
     * constructor method
     * @param greetingService
     */
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
