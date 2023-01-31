//package com.Appystack.springdec6.aop;
//
//import org.aspectj.lang.annotation.*;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//@EnableAspectJAutoProxy
//public class Human {
//
//    @After("pointCut()") //advice--//designator and point cut expression
//    public void wakeUp(){
//        System.out.println("Wake up");
//    }
//
//    @Before("pointCut()") //advice--//designator and point cut expression
//    public void sleep(){
//        System.out.println("Sleep");
//    }
//
//    @Pointcut(value = "execution(*  com.Appystack.springdec6.aop.GirlStudent.*(..))")
//    public void pointCut(){}
//
//    @AfterReturning(value = "execution( public int study(..))", returning = "intValue")
//    public void getUp(int intValue){
//        System.out.println("get up"+ intValue);
//    }
//    @AfterThrowing(value = "execution(public void exe(..))",throwing = "throwValue")
//    public void showExc(Exception throwValue){
//        System.out.println("In exception =>"+ throwValue);
//    }
//}
//
////stored procedure
////web services