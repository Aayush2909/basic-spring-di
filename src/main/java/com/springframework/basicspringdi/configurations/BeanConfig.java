package com.springframework.basicspringdi.configurations;

import com.springframework.basicspringdi.implementations.ConstructorInjectedGreetingImpl;
import com.springframework.basicspringdi.implementations.I18nEnglishGreetingImpl;
import com.springframework.basicspringdi.implementations.I18nHindiGreetingImpl;
import com.springframework.basicspringdi.implementations.I18nJapaneseGreetingImpl;
import com.springframework.basicspringdi.implementations.PropertyInjectedGreetingImpl;
import com.springframework.basicspringdi.implementations.SetterInjectedGreetingImpl;
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

    @Bean("i18nService")
    @Profile("ENG")
    I18nEnglishGreetingImpl i18nEnglishGreeting() {
        return new I18nEnglishGreetingImpl();
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
}
