package io.toosimple.sample.inject.wots.controller;

import io.toosimple.sample.inject.wots.services.GreetingService;

/**
 * sample of ConstructorInject
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }

}
