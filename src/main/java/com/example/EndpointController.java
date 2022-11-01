package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EndpointController {

    @GetMapping("/HelloWorld")
    public String hello() {
        return "Hello, World commit Added!";
    }
}
