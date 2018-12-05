package com.aop.ThrowAdvice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowadviceDemo01 {
    public void myException(Exception e)
    {
        System.out.println("something wrong " + e.getMessage());
    }
}
