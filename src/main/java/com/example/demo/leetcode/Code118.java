package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 118 杨辉三角
public class Code118 {

    public static void main(String[] args) {
        System.out.println(new Code118().generate(1));
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>  list = new ArrayList();
        if (numRows==0){
            return list;
        }
        for (int i = 1; i < numRows+1; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <i ; j++) {
                if (j==0){
                    l.add(1);
                }else if (j==i-1){
                    l.add(1);
                }else {
                   List<Integer> ll =  list.get(i-2);
                    l.add(ll.get(j)+ll.get(j-1));
                }
            }
            list.add(l);
        }
        return list;
    }
}
