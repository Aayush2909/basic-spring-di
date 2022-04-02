package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!!! - Property Based";
    }
}
