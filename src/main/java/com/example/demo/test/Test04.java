package com.example.demo.test;

public class Test04 {

    public static void main(String[] args) {
        String a = null;
        //与符号短路问题
        if (a == null || a.equals("")) {
            System.out.println(1);
        }
    }
}
