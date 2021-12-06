package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==3){
                list.remove(i);
            }
        }
        System.out.println(list);
        Integer a = 128;
        Integer b = 127;
        System.out.println(a==b);
        new Test03().main();
    }
    Integer a  = 222;
    public  void main() {
        System.out.println(a ==222);
    }
}
