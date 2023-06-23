package com.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class aopForVtuber {
    public void before () {
        System.out.println("Before the function .");
    }

    public void after () {
        System.out.println("After the functuion .");
    }

    public void arround (ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        System.out.println("This is arround function .");
    }

}
