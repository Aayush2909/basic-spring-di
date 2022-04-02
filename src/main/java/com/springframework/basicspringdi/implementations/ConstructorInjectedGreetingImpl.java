package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!!! - Constructor Based";
    }
}
