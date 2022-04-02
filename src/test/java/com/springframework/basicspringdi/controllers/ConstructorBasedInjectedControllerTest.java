package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.implementations.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedInjectedControllerTest {

    ConstructorBasedInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorBasedInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}