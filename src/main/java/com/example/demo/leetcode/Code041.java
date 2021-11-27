package com.example.demo.leetcode;

import java.util.HashMap;

public class Code041 {
    public static void main(String[] args) {

    }

    public int firstMissingPositive(int[] nums) {
        HashMap map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 0);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (map.containsKey(i)) {
                continue;
            } else {
                return i;
            }
        }
        return 1;
    }
}
