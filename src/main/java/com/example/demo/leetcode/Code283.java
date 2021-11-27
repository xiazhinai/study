package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 283. 移动零
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class Code283 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 0, 5, 0, 12};
        moveZeroes2(a);
    }

    /**
     * 失败
     * @param num
     */
    public static void moveZeroes(int[] num) {
        Integer[] nums;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < num.length; i++) {
            list.add(num[i]);
        }
        int k = 0;
//        AtomicInteger k = new AtomicInteger();
        List gg = new ArrayList();
//        list.forEach(it -> {
//            if (it == 0) {
//                list.remove(it);
//                gg.add(1);
////                k++;
//            }
//        });

        for (Integer a : list
        ) {
            if (a == 0) {
                list.remove(a);
                gg.add(1);
                k++;
            }
        }

        for (int i = 0; i < gg.size(); i++) {
            list.add(0);
        }

        nums = list.toArray(new Integer[list.size()]);
        System.out.println(nums);
    }


    public static void moveZeroes2(int[] num) {

        int k = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                k++;
            } else {
                num[i - k] = num[i];
            }
        }
        for (int i = k-1; i >= 0 ; i--) {
            num[num.length-i-1]= 0 ;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }


}
