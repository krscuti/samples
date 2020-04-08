package io.toosimple.sample.inject.wots.controller;

import io.toosimple.sample.inject.wots.services.GreetingService;

/**
 * sample of SetterInject
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }

}
