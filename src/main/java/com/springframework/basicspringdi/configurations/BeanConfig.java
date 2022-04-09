package com.springframework.basicspringdi.configurations;

import com.springframework.basicspringdi.implementations.ConstructorInjectedGreetingImpl;
import com.springframework.basicspringdi.implementations.I18nEnglishGreetingImpl;
import com.springframework.basicspringdi.implementations.I18nHindiGreetingImpl;
import com.springframework.basicspringdi.implementations.I18nJapaneseGreetingImpl;
import com.springframework.basicspringdi.implementations.PropertyInjectedGreetingImpl;
import com.springframework.basicspringdi.implementations.SetterInjectedGreetingImpl;
import com.springframework.basicspringdi.repositories.EnglishGreetingRepository;
import com.springframework.basicspringdi.repositories.EnglishGreetingRepositoryImpl;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfig {

    @Bean
    ConstructorInjectedGreetingImpl constructorInjectedGreetingImpl() {
        return new ConstructorInjectedGreetingImpl();
    }

    @Bean
    SetterInjectedGreetingImpl setterInjectedGreetingImpl() {
        return new SetterInjectedGreetingImpl();
    }

    @Bean
    PropertyInjectedGreetingImpl propertyInjectedGreetingImpl() {
        return new PropertyInjectedGreetingImpl();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepositoryImpl() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean("i18nService")
    @Profile("ENG")
    I18nEnglishGreetingImpl i18nEnglishGreeting(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingImpl(englishGreetingRepository);
    }

    @Bean("i18nService")
    @Profile({"HIN", "default"})
    I18nHindiGreetingImpl i18nHindiGreeting() {
        return new I18nHindiGreetingImpl();
    }

    @Bean("i18nService")
    @Profile("JAP")
    I18nJapaneseGreetingImpl i18nJapaneseGreeting() {
        return new I18nJapaneseGreetingImpl();
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    PetService otherPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cow");
    }
}
