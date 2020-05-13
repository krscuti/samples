package io.tosimple.anotherspringboot.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomBeanPostProcessor implements BeanPostProcessor {
    public CustomBeanPostProcessor() {
        log.info("## CustomBeanPostProcessor constructor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).beforeInit();
            log.info("## LifeCycleDemoBean bean has been Init --before, bean id: " + bean.toString() +  ", bean hashcode: "+ bean.hashCode());
        }
//        log.info("## Bean has been Init --before, bean id: " + bean.toString() +  ", bean hashcode: "+ bean.hashCode());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean) bean).afterInit();
            log.info("## LifeCycleDemoBean bean has been Init --after, bean id: " + bean.toString() +  ", bean hashcode: "+ bean.hashCode());
        }
//        log.info("## Bea has been Init --after, bean id: " + bean.toString() +  ", bean hashcode: "+ bean.hashCode());
        return bean;
    }
}
