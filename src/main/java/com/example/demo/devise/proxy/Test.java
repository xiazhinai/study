package com.example.demo.devise.proxy;

import java.lang.reflect.Proxy;

/**
 * @author xiazhinai
 */
public class Test {


    public static void main(String[] args) {
        StudentImpl student = new StudentImpl();
        TestProxy testProxy = new TestProxy(student);
        Student mouse = (Student) Proxy.newProxyInstance(testProxy.getClass().getClassLoader(), new Class[]{Student.class}, testProxy);
        mouse.eat();

    }
}
