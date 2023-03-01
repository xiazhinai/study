package com.example.demo.devise.proxy;

import lombok.SneakyThrows;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiazhinai
 */
public class Test {


    @SneakyThrows
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl();
        TestProxy testProxy = new TestProxy(student);
        Student mouse = (Student) Proxy.newProxyInstance(testProxy.getClass().getClassLoader(), new Class[]{Student.class}, testProxy);
        mouse.eat();

        Class<?> aClass = Class.forName("com.example.demo.devise.proxy.Student");
//        for (Method method : aClass.getMethods()) {
//            method.invoke(aClass.newInstance().getClass().getClassLoader(),aClass.getInterfaces(),null);
//        }s


        Student o =(Student) Class.forName("com.example.demo.devise.proxy.StudentImpl").newInstance();
        o.eat();
    }

}
