package io.tosimple.anotherspringboot.annotations.configuration;

import io.tosimple.anotherspringboot.annotations.configuration.ConfigurationedBean.ExampleConfigurationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * example of @Configuration + @Bean
 * create on 2020-5-3
 */
@Configuration
public class ExampleConfiguration {

    @Bean
    @Scope(value = "prototype")
    public ExampleConfigurationBean exampleConfigurationBean(){
        return new ExampleConfigurationBean();
    }

    @Bean
//    @Scope(value = "prototype")
    public MyBeanConsumer myBeanConsumer(){
        return new MyBeanConsumer(exampleConfigurationBean());
    }

    /**
     * @Configuration(@Component) and @Bean is using together by springboot
     */
}
