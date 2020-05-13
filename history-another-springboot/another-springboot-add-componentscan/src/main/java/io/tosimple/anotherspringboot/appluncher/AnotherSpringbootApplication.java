package io.tosimple.anotherspringboot.appluncher;

import io.tosimple.anotherspringboot.annotations.configuration.ConfigurationedBean.ExampleConfigurationBean;
import io.tosimple.anotherspringboot.annotations.configuration.MyBeanConsumer;
import io.tosimple.anotherspringboot.di.withspring.controller.MyController;
import io.tosimple.anotherspringboot.di.withspring.controller.ConstructorInjectedController;
import io.tosimple.anotherspringboot.di.withspring.controller.PropertyInjectedController;
import io.tosimple.anotherspringboot.di.withspring.controller.SetterInjectedController;
import io.tosimple.anotherspringboot.lifecycle.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.tosimple.anotherspringboot"})
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

//        System.out.println("----------customBeanProcessor");
//        CustomBeanPostProcessor customBeanPostProcessor = (CustomBeanPostProcessor)ctx.getBean("customBeanPostProcessor");

        System.out.println("----------lifeCycleDemoBean");
        LifeCycleDemoBean customBeanPostProcessor = (LifeCycleDemoBean)ctx.getBean("lifeCycleDemoBean");
        System.out.println("## LifeCycleDemoBean bean has been Init --before, bean id: " + customBeanPostProcessor.toString() +  ", bean hashcode: "+ customBeanPostProcessor.hashCode());

        //question about same bean name? (dont think too much please, just be simple

        System.out.println("----------ExampleConfigurationBean");

        ExampleConfigurationBean exampleConfigurationBean = (ExampleConfigurationBean)ctx.getBean("exampleConfigurationBean");
        ExampleConfigurationBean exampleConfigurationBean2 = (ExampleConfigurationBean)ctx.getBean("exampleConfigurationBean");
        MyBeanConsumer myBeanConsumer = (MyBeanConsumer)ctx.getBean("myBeanConsumer");
        MyBeanConsumer myBeanConsumer2 = (MyBeanConsumer)ctx.getBean("myBeanConsumer");

        System.out.println("## exampleConfigurationBean from ctx, hashcode = "+ exampleConfigurationBean.hashCode());
        System.out.println("## exampleConfigurationBean2 from ctx, hashcode = "+ exampleConfigurationBean2.hashCode());
        System.out.println("## myBeanConsumer from ctx, hashcode = "+ myBeanConsumer.hashCode());
        System.out.println("## myBeanConsumer2 from ctx, hashcode = "+ myBeanConsumer2.hashCode());
        System.out.println("## exampleConfigurationBean from myBeanConsumer, hashcode = "+ myBeanConsumer2.getExampleConfigurationBean().hashCode());
        System.out.println("## exampleConfigurationBean from myBeanConsumer, hashcode = "+ myBeanConsumer.getExampleConfigurationBean().hashCode());
    }

}
