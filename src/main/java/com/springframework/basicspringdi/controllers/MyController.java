package com.springframework.basicspringdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getGreetings() {

        System.out.println("Hello");

        return "Hi folks!";
    }
}
