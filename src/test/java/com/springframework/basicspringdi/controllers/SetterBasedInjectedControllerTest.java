package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.implementations.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedInjectedControllerTest {

    SetterBasedInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterBasedInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}