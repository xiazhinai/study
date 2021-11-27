package com.example.demo.select;

/**
 * 二分查找
 */
public class TwoSelect {


    //要求传入的数组是一个已经排序好的数组
    public static Integer towSelect(int[] data, int a) {
        int start = 0;
        int end = data.length-1;
        int length = end / 2;

        while (true) {
            //循环结构 对半拆分
            if (a > data[length]) {
                start = length;
                length = (start + end) / 2;
            } else if (a == data[length]) {
                return length;
            } else {
                end = length;
                length = (start + end) / 2;
            }

            //特殊处理
            if (end-length==1){
                if (data[end] == a) {
                    return end;
                } else if (data[start]==a){
                    return start;
                } else {
                    return -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,4,5,7,9,11,13,24,54,99};
        System.out.println(towSelect(a,13));
    }
}
