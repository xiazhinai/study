package com.example.demo.leetcode;

//724. 寻找数组的中心索引
public class Code724 {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        int sum = 0,a = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum - a - nums[i] == a) {
                return i;
            }
            a = a + nums[i];
        }
        if (sum - nums[nums.length-1]==0){
            return nums.length-1;
        }
        return -1;
    }
}
