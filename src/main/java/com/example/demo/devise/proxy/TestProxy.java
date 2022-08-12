package com.example.demo.devise.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiazhinai
 */
public class TestProxy implements InvocationHandler {

    private Object object;

    TestProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("下课了");
        Object invoke = method.invoke(object, args);
        System.out.println("上课了");
        return invoke;
    }
}
