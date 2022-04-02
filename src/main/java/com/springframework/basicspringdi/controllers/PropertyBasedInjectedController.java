package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedInjectedController {

    @Qualifier("propertyInjectedGreetingImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
