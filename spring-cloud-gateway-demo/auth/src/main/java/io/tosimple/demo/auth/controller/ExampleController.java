package io.tosimple.demo.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ExampleController {

    @RequestMapping(name="/hello", value = "/hello", method = RequestMethod.GET)
    public String reqGate(){
        return "hello from auth service！";
    }

}