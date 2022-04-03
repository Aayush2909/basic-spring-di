package com.springframework.basicspringdi.implementations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof BeanLifecycleDemoImpl){
            ((BeanLifecycleDemoImpl) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLifecycleDemoImpl){
            ((BeanLifecycleDemoImpl) bean).afterInit();
        }

        return bean;
    }
}
