package io.toosimple.sample.inject.wots.controller;

import io.toosimple.sample.inject.wots.services.GreetingService;

/**
 * sample of PropertyInject
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }

}
