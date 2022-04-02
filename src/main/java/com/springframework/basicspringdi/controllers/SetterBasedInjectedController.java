package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterInjectedGreetingImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
