package com.example.demo.leetcode;

import java.util.HashMap;

//888. 公平的糖果棒交换
public class Code888 {

    public static void main(String[] args) {

    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int[] a = new int[]{0, 0};
        HashMap map = new HashMap<Integer, Integer>();
        int sumA = 0, sumB = 0;
        for (int i = 0; i < A.length; i++) {
            sumA = sumA + A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sumB = sumB + B[i];
            map.put(B[i], 1);
        }
        int avg = (sumA - sumB) / 2;
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i] - avg)) {
                a[0] = A[i];
                a[1] = A[i] - avg;
                return a;
            }
        }
        return a;
    }
}
