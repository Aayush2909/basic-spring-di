package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;

public class SetterInjectedGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!!! - Setter Based";
    }
}
