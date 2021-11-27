package com.example.demo.leetcode;

//44. 通配符匹配
public class Code044No {
    public static void main(String[] args) {
        System.out.println(new Code044No().isMatch("abcababc","a*c"));
    }

    public boolean isMatch(String s, String p) {
        if ("*".equals(p)) {
            return true;
        } else if (s == null && p == null) {
            return true;
        } else if (s != null && p == null) {
            return false;
        } else if (s == null) {
            return false;
        } else if(!p.contains("*")){
            String[] ss = s.split("");
            String[] pp = p.split("");
            if (ss.length!=pp.length){
                return false;
            }
            for (int i = 0; i < ss.length; i++) {
                if (!ss[i].equals(pp[i])){
                    if (!pp[i].equals("?")){
                        return false;
                    }
                }
            }
            return true;
        }else {

        }
        return false;
    }
}
