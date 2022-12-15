package com.Appystack.springdec6.ioc;

public class Jio implements Sim {

    @Override
    public void calling() {
        System.out.println("Jio calling ");
    }

    @Override
    public void msg() {
        System.out.println("Jio msg");
    }
}
