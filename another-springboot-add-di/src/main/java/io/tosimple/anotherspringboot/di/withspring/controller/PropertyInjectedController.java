package io.tosimple.anotherspringboot.di.withspring.controller;

import io.tosimple.anotherspringboot.di.withspring.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * example of Property Injection
 */
@Controller
public class PropertyInjectedController{

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
