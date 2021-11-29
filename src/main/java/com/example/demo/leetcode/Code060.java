package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 60. 排列序列
 */
public class Code060 {
    public static void main(String[] args) {
        ;
        System.out.println(new Code060().getPermutation(4, 9));
    }

    public String getPermutation(int n, int k) {
        switch (n) {
            case 1:
                return "1";
            case 2:
                if (k == 1) {
                    return "12";
                }
                return "21";
            default:
                List<Integer> list = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    list.add(i);
                }
                StringBuffer sb = new StringBuffer("");
                int m = 0;
                int s = 0;
                int j = 0;
                while (n >= 3) {
                    j = (n - 1) * (n - 2);
                    if (k<j){
                        sb.append(list.get(0));
                        list.remove(0);
                        n--;
                        continue;
                    }
                    s = k / j;
                    k = k % j;
                    if (k == 0) {
                        for (int i1 = list.size() - 1; i1 > -1; i1--) {
                            sb.append(list.get(i1));
                        }
                        return sb.toString();
//                    }
//                    if (k == 1) {
//                        for (int i1 = 0; i1 < list.size(); i1++) {
//                            sb.append(list.get(i1));
//                        }
//                        return sb.toString();
                    } else {
                        sb.append(list.get(s));
                        list.remove(s);
                        n--;
                    }

                }
                sb.append(list.get(k - 1));
                list.remove(k - 1);
                sb.append(list.get(0));
                return sb.toString();
        }
    }
}


/*
 * 1234
 * 1243
 * 1324
 * 1342
 * 1423
 * 1432
 *
 *
 * 12345
 * 12354
 * 12435
 * 12453
 * 12534
 * 12543
 * 13245
 * 13254
 * 13425
 * 13452
 * 13524
 * 13542
 * 14235
 * 14253
 * 14325
 * 14352
 * 14523
 * 14532
 * 15234
 * 15243
 * 15324
 * 15342
 * 15423
 * 15432
 *
 *
 *
 *
 * 1  1
 * 2  2
 * 3  6
 * 4  24
 * 5  120
 * */
