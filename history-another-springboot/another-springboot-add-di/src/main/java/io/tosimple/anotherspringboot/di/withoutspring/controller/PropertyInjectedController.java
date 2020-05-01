package io.tosimple.anotherspringboot.di.withoutspring.controller;

import io.tosimple.anotherspringboot.di.withoutspring.service.GreetingService;

/**
 * example of Property Injection
 */
public class PropertyInjectedController{

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
