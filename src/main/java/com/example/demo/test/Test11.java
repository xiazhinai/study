package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试 ? 泛型
 */
public class Test11 {

    public static void main(String[] args) {
        List<? super Number> list = new ArrayList<>();
        list.add(new Integer(1));
    }
}
