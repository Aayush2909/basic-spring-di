package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedInjectedController {

    private final GreetingService greetingService;

    public ConstructorBasedInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
