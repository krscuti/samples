package io.tosimple.anotherspringboot.di.withspring.controller;

import org.springframework.stereotype.Component;

@Component
public class MyController {
    public String sayHHello(){
        System.out.println("Hello World!!!");

        return "Hello folks!";
    }
}
