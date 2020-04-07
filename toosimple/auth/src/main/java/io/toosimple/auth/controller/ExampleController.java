package io.toosimple.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ExampleController {

    @GetMapping("/hello auth")
    public String helloExample() {
        String str = "hello auth example";
        System.out.println(str);
        return str;
    }
}
