package com.aop.Arround;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class MyArround implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前面");
        Object proceed = methodInvocation.proceed();
        System.out.println("后面");
        return proceed;
    }
}
