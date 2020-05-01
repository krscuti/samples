package io.tosimple.anotherspringboot.di.withspring.controller;

import io.tosimple.anotherspringboot.di.withspring.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * example of constructor Injection
 */
@Controller
public class ConstructorInjectedController {

    /**
     * constructor method
     * not required of autowired
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
