package com.springframework.basicspringdi;

import com.springframework.basicspringdi.controllers.ConstructorBasedInjectedController;
import com.springframework.basicspringdi.controllers.MyController;
import com.springframework.basicspringdi.controllers.PropertyBasedInjectedController;
import com.springframework.basicspringdi.controllers.SetterBasedInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BasicSpringDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.getGreetings());

        System.out.println("\n--------- Property Based ---------");
        PropertyBasedInjectedController propertyBasedInjectedController = (PropertyBasedInjectedController) ctx.getBean("propertyBasedInjectedController");
        System.out.println(propertyBasedInjectedController.getGreeting());

        System.out.println("\n--------- Setter Based ---------");
        SetterBasedInjectedController setterBasedInjectedController = (SetterBasedInjectedController) ctx.getBean("setterBasedInjectedController");
        System.out.println(setterBasedInjectedController.getGreeting());

        System.out.println("\n--------- Constructor Based ---------");
        ConstructorBasedInjectedController constructorBasedInjectedController = (ConstructorBasedInjectedController) ctx.getBean("constructorBasedInjectedController");
        System.out.println(constructorBasedInjectedController.getGreeting());

    }

}
