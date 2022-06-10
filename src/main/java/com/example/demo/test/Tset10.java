package com.example.demo.test;

/**
 * 测试copilot 插件
 */
public class Tset10 {
    //main方法
    public static void main(String[] args) {
        //创建一个对象
        Tset10 tset10 = new Tset10();
        //调用方法
        tset10.test();
    }

    //获取今天星期几
    public void test() {
        //获取当前日期
        String date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        //获取当前日期的星期
        String week = new java.text.SimpleDateFormat("EEEE").format(new java.util.Date());
        //输出
        System.out.println(date + "是" + week + "星期");
    }

    //冒泡排序
    public void test1() {
        //创建一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //循环遍历数组
        for (int i = 0; i < arr.length - 1; i++) {
            //循环遍历数组
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //如果当前数组的值大于后面的值
                if (arr[j] > arr[j + 1]) {
                    //交换两个值
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
