package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;

public class PropertyInjectedGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!!! - Property Based";
    }
}
