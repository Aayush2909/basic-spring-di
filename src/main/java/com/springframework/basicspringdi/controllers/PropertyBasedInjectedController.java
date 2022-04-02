package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingService;

public class PropertyBasedInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {

        return greetingService.sayGreeting();
    }

}
