package com.calories.counter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private static final String DEFAULT_WELCOME_RESPONSE = "Hello %s!";

    @GetMapping("/greeting")
    public String greeting(@RequestParam (value="name", defaultValue = "human") String name){
        return String.format(DEFAULT_WELCOME_RESPONSE, name);
    }
}
