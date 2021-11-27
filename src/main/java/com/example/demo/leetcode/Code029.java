package com.example.demo.leetcode;

/**
 * 29. 两数相除
 * 不能使用乘法 触发 mod
 */
public class Code029 {

    public static void main(String[] args) {

        System.out.println(new Code029().divide(-2147483648, -3));
    }

    public int divide(int dividend, int divisor) {
        int k = 0;
        if (dividend == 0) {
            return 0;
        } else if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        } else if (divisor == 1) {
            return dividend;
        } else if (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) {
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
            dividend = dividend - divisor;
            while (dividend >= 0) {
                k++;
                dividend = dividend - divisor;
            }
            return k;
        } else {
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
            dividend = dividend - divisor;
            while (dividend >= 0) {
                k++;
                dividend = dividend - divisor;
            }
            return -k;
        }
    }
}
