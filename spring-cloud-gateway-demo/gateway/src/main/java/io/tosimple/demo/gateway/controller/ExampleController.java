package io.tosimple.demo.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class ExampleController {

    @RequestMapping(name="/hello", value = "/hello", method = RequestMethod.GET)
    public String reqGate(){
        return "hello from gateway！";
    }

}
