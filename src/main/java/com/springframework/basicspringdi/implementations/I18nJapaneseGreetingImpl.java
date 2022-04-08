package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.services.GreetingService;

public class I18nJapaneseGreetingImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Konichiwa tomodachi!!!";
    }
}
