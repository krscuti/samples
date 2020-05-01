package io.tosimple.anotherspringboot.di.withspring.qulifiers.service;

import io.tosimple.anotherspringboot.di.withspring.service.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by para Vida Sencilla
 * On 2020-04-29
 */
@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property Impl";
    }
}
