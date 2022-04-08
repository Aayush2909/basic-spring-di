package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;

public class I18nHindiGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Namaste doston!!!";
    }
}
