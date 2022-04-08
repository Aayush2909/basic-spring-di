package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;

public class I18nEnglishGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hi friends!!!";
    }
}
