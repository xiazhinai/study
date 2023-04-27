package com.example.demo.template;

public class 获取栈帧 {
    public static void main(String[] args) {
        System.out.println(getClassName());
        System.out.println(getMethodName());
    }


    public static String getClassName(){
        return Thread.currentThread() .getStackTrace()[2].getClassName();
    }

    public static String getMethodName(){
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
