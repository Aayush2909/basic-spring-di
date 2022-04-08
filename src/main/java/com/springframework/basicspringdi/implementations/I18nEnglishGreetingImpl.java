package com.springframework.basicspringdi.implementations;

import com.springframework.basicspringdi.repositories.EnglishGreetingRepository;
import com.springframework.basicspringdi.services.GreetingService;

public class I18nEnglishGreetingImpl implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingImpl(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.sayGreeting();
    }
}
