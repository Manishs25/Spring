package com.Appystack.springdec6.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//what is scope and what is beanscope and what is @scope
public class Company {
    @Autowired
    private Employee employee;

    @Autowired
    private Employee employee1;


//    public Company(Employee employee) {
//        this.employee = employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    public Company(){
        System.out.println("Company constructor");
    }

    public void display() {
        employee.show();
        employee.show();
    }

}
