package com.Appystack.springdec6;

import com.Appystack.springdec6.di.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@explain anottations uesd in spring boot
@SpringBootApplication
@RestController
public class JavaBatchApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavaBatchApplication.class, args);

//        Vodafone obj1 = context.getBean(Vodafone.class);
//        obj1.calling();
//
//        Jio obj2 = context.getBean(Jio.class);
//        obj2.msg();

        Company company = context.getBean(Company.class);
        company.display();
    }

    @GetMapping("hii")
    public String hellomsg() {
        return "Hello Spring!!!";
    }

}
