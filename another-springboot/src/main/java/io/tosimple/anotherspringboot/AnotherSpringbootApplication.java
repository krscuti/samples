package io.tosimple.anotherspringboot;

import io.tosimple.anotherspringboot.di.withspring.controller.MyController;
import io.tosimple.anotherspringboot.di.withspring.controller.ConstructorInjectedController;
import io.tosimple.anotherspringboot.di.withspring.controller.PropertyInjectedController;
import io.tosimple.anotherspringboot.di.withspring.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnotherSpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AnotherSpringbootApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.sayHHello());

        System.out.println("----------propertyInjectedController");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------setterInjectedController");

        SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----------constructorController");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("----------myController --primary");

        System.out.println(myController.getGreeting());

    }

}
