package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedInjectedController {

    private final GreetingService greetingService;

    public ConstructorBasedInjectedController(@Qualifier("constructorInjectedGreetingImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
