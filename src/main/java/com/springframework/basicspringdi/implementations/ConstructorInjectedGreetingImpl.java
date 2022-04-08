package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;

public class ConstructorInjectedGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!!! - Constructor Based";
    }
}
