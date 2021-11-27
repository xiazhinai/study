package com.example.demo.sort;

//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{34, 5, 32, 4, 56, 6, 787, 77, 1, 55,0,-99};
        int[] b = new InsertSort().sort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            System.out.print(",");
        }
    }

    public int[] sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            for (int j = 1; j <= i; j++) {
                if (a[i - j] >= x) {
                    a[i - j + 1] = a[i - j];
                } else {
                    a[i - j + 1] = x;
                    j = Integer.MAX_VALUE - 1;
                }
                if (j == i) {
                    a[i - j] = x;
                }
            }
        }
        return a;
    }

}
