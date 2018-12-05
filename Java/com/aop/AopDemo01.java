package com.aop;

public class AopDemo01 {
    public void Method1()
    {
        System.out.println("method1");
    }
    public void Method2()
    {
        System.out.println("method2");
    }
    public void Method3()
    {
        System.out.println("method3");
    }

    public void ArroundTest()
    {
        System.out.println("中间的");
    }

    public void ExceptionTest () throws Exception
    {
        int a = 5 / 0;
        System.out.println("ExceptionTest");
    }
}
