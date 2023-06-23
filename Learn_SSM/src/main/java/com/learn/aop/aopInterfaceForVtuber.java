package com.learn.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class aopInterfaceForVtuber implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before the function");
        System.out.println("Target: " + target.getClass());
        System.out.println("Args: " + Arrays.toString(args));
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After the function");
        System.out.println("Target: " + target.getClass());
        System.out.println("Args: " + Arrays.toString(args));
        System.out.println("Return: " + returnValue);
    }
}
