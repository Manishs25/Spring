package com.Appystack.springdec6.ioc;
//ioc is a container which contains objects of class and it creates manage and destroy object
public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("vodafone calling");
    }

    @Override
    public void msg() {
        System.out.println("vodafone msg");
    }
}
