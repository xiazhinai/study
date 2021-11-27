package com.example.demo.leetcode;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

//480. 滑动窗口中位数
public class Code480 {
    public static void main(String[] args) {
//        int[] a = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] a = new int[]{1,2,3,4,2,3,1,4,2};
        System.out.println(Arrays.toString(new Code480().medianSlidingWindow3(a, 3)));
    }

    //超时
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] a = new double[k];
        double[] b = new double[nums.length - k + 1];
        boolean c = false;
        if (k % 2 == 0) {
            c = true;
        }
        int d = k / 2;
        for (int i = 0; i < b.length; i++) {
            for (int i1 = 0; i1 < a.length; i1++) {
                a[i1] = nums[i + i1];
            }
            Arrays.sort(a);
            b[i] = c ? (a[d] + a[d - 1]) / 2 : a[d];
        }
        return b;
    }

    //超时
    public double[] medianSlidingWindow2(int[] nums, int k) {
        Double[] a = new Double[k];
        double[] b = new double[nums.length - k + 1];
        boolean c = false;
        if (k % 2 == 0) {
            c = true;
        }
        int d = k / 2;
        Queue<Double> list = new LinkedBlockingQueue();
        for (int i1 = 0; i1 < a.length; i1++) {
            list.offer((double) nums[i1]);
        }
        a = list.toArray(a);
        Arrays.sort(a);
        b[0] = c ? (a[d] + a[d - 1]) / 2 : a[d];
        for (int i = 1; i < b.length; i++) {
            list.poll();
            list.offer((double) nums[k - 1 + i]);
            a = list.toArray(a);
            Arrays.sort(a);
            b[i] = c ? (a[d] + a[d - 1]) / 2 : a[d];
        }
        return b;
    }


    //70ms
    public double[] medianSlidingWindow3(int[] nums, int k) {
        double[] a = new double[k];
        double[] b = new double[nums.length - k + 1];
        boolean c = false;
        if (k % 2 == 0) {
            c = true;
        }
        for (int i1 = 0; i1 < a.length; i1++) {
            a[i1] = nums[i1];
        }
        Arrays.sort(a);
        int d = k / 2;
        b[0] = c ? (a[d] + a[d - 1]) / 2 : a[d];
        for (int i = 1; i < b.length; i++) {
            a = abc(a, nums[i - 1], nums[k - 1 + i]);
            b[i] = c ? (a[d] + a[d - 1]) / 2 : a[d];
        }
        return b;
    }


    public double[] abc(double[] a, double b, double c) {
        int f = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                f = i;
                i = a.length;
            }
        }
        if (b > c) {
            for (int i = f; i >= 1; i--) {
                if (a[i] > c) {
                    if (c >= a[i-1]){
                        a[i] = c;
                        return a;
                    }
                    a[i] = a[i - 1];
                } else {
                    a[i] = c;
                    return a;
                }
            }
            a[0] = c;
        } else if (b < c) {
            if (f == a.length - 1) {
                a[a.length - 1] = c;
                return a;
            }

            for (int i = f; i < a.length; i++) {
                if (a[i] < c && i < a.length - 1) {
                    if (c<=a[i+1]){
                        a[i] = c;
                        return a;
                    }
                    a[i] = a[i + 1];
                } else {
                    a[i] = c;
                    return a;
                }
            }
        } else {
            return a;
        }

        return a;
    }

}
