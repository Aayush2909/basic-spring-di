package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingService;

public class SetterBasedInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
