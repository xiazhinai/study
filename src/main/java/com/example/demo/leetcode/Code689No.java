package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Code689No {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，找出三个长度为 k 、互不重叠、且3 * k 项的和最大的子数组，并返回这三个子数组。
     * 以下标的数组形式返回结果，数组中的每一项分别指示每个子数组的起始位置（下标从 0 开始）。如果有多个结果，返回字典序最小的一个
     * @param nums
     * @param k
     * @return
     */
        public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>(k);
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (nums.length/3==k&&nums.length%k==0){
                return new int[]{0,k,2*k};
            }
            int ks=0;
            for (int i = 0; i < nums.length; i++) {
                if (i>=k){
                    ks = ks-nums[i-k];
                    ks +=nums[i];
                    map.put(i-k+1,ks);
                    list.add(ks);
                }else {
                    ks +=nums[i];
                    if (i==k-1){
                        map.put(0,ks);
                        list.add(ks);
                    }
                }
            }
            System.out.println(map);
            return null;
        }



        public static void main(String[] args) {
            int[] ints = new int[]{1,2,1,2,6,7,5,1};
            new Code689No().maxSumOfThreeSubarrays(ints,2);
        }

}
