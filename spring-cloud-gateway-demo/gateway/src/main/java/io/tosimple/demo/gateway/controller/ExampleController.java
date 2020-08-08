package io.tosimple.demo.gateway.controller;

import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.socket.server.upgrade.ReactorNettyRequestUpgradeStrategy;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/gateway")
public class ExampleController {

    @RequestMapping(name="/hello", value = "/hello", method = RequestMethod.GET)
    public String reqGate(){
        return "hello gateway！";
    }

    @RequestMapping(name="/hello2", value = "/hello2", method = RequestMethod.GET)
    public void reqGate2(){
        System.out.println("===");
    }

}
