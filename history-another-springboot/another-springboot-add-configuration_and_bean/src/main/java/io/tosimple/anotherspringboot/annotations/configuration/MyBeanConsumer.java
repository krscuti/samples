package io.tosimple.anotherspringboot.annotations.configuration;

import io.tosimple.anotherspringboot.annotations.configuration.ConfigurationedBean.ExampleConfigurationBean;

public class MyBeanConsumer {

    ExampleConfigurationBean exampleConfigurationBean;

    public MyBeanConsumer(ExampleConfigurationBean exampleConfigurationBean) {
        System.out.println("## MyBeanConsumer created");
        System.out.println("## exampleConfigurationBean hashcode = " + exampleConfigurationBean.hashCode());
        this.exampleConfigurationBean = exampleConfigurationBean;
    }

    public ExampleConfigurationBean getExampleConfigurationBean() {
        return exampleConfigurationBean;
    }
}
