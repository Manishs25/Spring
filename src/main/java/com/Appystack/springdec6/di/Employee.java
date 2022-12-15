package com.Appystack.springdec6.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Employee {
    public void show(){
        System.out.println("in employee show");
    }
    public Employee(){
        System.out.println("Employee constructor");
    }
}
