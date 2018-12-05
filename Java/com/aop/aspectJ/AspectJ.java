package com.aop.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectJ {
    public void MyBefore()
    {
        System.out.println("前置");
    }

    public void MyAfter()
    {
        System.out.println("后置");
    }
    public void MyThrows()
    {
        System.out.println("异常");
    }
    public void arround(ProceedingJoinPoint p)
    {
        System.out.println("环绕前置");
        try {
            p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后置");

    }
}
