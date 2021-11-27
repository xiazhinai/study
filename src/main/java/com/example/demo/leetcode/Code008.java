package com.example.demo.leetcode;



public class Code008 {
    public static void main(String[] args) {
        System.out.println("  123123 34 3432 12312     ".trim());
        System.out.println(Double.parseDouble("-91283472332"));
        System.out.println(new Code008().myAtoi("+-12"));
    }

    public int myAtoi(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        String a = s.trim();
        String[] b = a.split("");
        Boolean is = true;
        StringBuffer sb = new StringBuffer("");

        Boolean pow = false;
        Boolean add = false;
        for (int i = 0; i < b.length; i++) {
            if (b[i].equals("1") || b[i].equals("2") || b[i].equals("3") || b[i].equals("4") || b[i].equals("5") || b[i].equals("6") || b[i].equals("7") || b[i].equals("8") || b[i].equals("9")) {
                add = true;
                sb.append(b[i]);
            } else if (b[i].equals("0")) {
                if (add) {
                    sb.append(b[i]);
                }
            } else if (b[i].equals("-")) {
                if (i == 0) {
                    pow = true;
                } else {
                    break;
                }
            } else if (b[i].equals("+")) {
                if (i != 0) {
                    break;
                }
            } else {
                if (i == 0) {
                    return 0;
                } else {
                    break;
                }
            }
        }
        if (sb.toString().equals("")) {
            return 0;
        }
        if (pow) {
            Double cc = Double.parseDouble("-" + sb.toString());
            if (cc < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }else {
                return cc.intValue();
            }
        } else {
            Double cc = Double.parseDouble(sb.toString());
            if (cc > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else {
                return cc.intValue();
            }
        }

    }
}
