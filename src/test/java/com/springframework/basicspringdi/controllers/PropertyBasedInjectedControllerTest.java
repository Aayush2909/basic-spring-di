package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.implementations.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyBasedInjectedControllerTest {
    
    PropertyBasedInjectedController controller;
    
    @BeforeEach
    void setUp() {
        controller = new PropertyBasedInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}