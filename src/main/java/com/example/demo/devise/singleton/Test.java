package com.example.demo.devise.singleton;

/**
 * @author xiazhinai
 * 单例模式
 */
public class Test {

    public static void main(String[] args) {
        //Singleton singleton1 = new Singleton(); //该代码会报错. 单例的本质就是让你无法新建多个重复的实体对象.减少消耗.

        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();
        System.out.println("singleton2== "+singleton2);
        System.out.println("singleton3== "+singleton3);
        System.out.println("singleton2==singleton3 结果:" +(singleton2==singleton3));
    }

}
