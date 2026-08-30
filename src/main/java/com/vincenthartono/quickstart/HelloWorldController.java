package com.vincenthartono.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello") // to create new directories in http://localhost:8080/..

    public String helloWorld() {
        return "Hello Vincent";
    }
}
