package com.example.demo.test;

import java.util.HashMap;

/**
 * 看hashmap源码
 */
public class Test08 extends HashMap {
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(64);
        objectObjectHashMap.put("11",null);
        objectObjectHashMap.get("11");
        System.out.println(objectObjectHashMap.containsKey("11"));
        //containsKey 的操作 基本可以被get 操作代替,除去空value的情况下,
        //扩容可能会导致 哈希位运算没法精准命中Node 非常不建议扩容



    }


}
