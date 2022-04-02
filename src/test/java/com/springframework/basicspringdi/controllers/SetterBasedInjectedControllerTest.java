package com.springframework.basicspringdi.controllers;

import com.springframework.basicspringdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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