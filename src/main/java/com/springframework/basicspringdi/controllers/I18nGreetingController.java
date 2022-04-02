package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nGreetingController {

    private final GreetingService greetingService;

    public I18nGreetingController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
