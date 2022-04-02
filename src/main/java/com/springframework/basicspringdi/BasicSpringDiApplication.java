package com.springframework.basicspringdi;

import com.springframework.basicspringdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BasicSpringDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.getGreetings());
    }

}
