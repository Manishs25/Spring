package com.Appystack.springdec6.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    @Bean
    public Vodafone getObj() {
        return new Vodafone();
    }
    @Bean
    public Jio getobj1(){
        return new Jio();
    }
}
