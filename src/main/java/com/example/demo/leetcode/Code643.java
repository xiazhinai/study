package com.example.demo.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//643. 子数组最大平均数 I
public class Code643 {
    public static void main(String[] args) {
        int[] a = new int[]{1,12,-5,-6,50,3};
        System.out.println(new Code643().findMaxAverage(a,4));
    }

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + (double) nums[i];
        }
        max = sum / k;
        for (int i = 0;i + k  < nums.length; i++) {
            sum = sum - nums[i];
            sum = sum + nums[i + k];
            if (nums[i]<nums[i+k]) {
                max = sum / k;
            }
        }
        return max;
    }
}
