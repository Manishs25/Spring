package com.Appystack.springdec6.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {
    public int study(int i) {
        System.out.println("boys study");
        return 69;
    }

    public void exe(String str) throws Exception {
        throw new Exception(str);
    }
}
