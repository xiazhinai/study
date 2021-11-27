package com.example.demo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 快排 递归
 */
public class QuerySort {
    static int b = 0;

    public static void main(String[] args) {
        //示例数据 a
        Integer[] a = new Integer[]{399, 4, 545, 345345, 453, 4523, 34, 567, 88, 23123, 5324, 45, 34, 45, 3412, 654, 542, 4123, 4543, 345, 56, 67, 878, 6564, 66565, 777, 66, 435, 657, 73456, 546345634, 565, 775, -11, 0, 0, 0, 434, 399, 4, 545, 345345, 453, 4523, 34, 567, 88, 23123, 5324, 45, 34, 45, 3412, 654, 542, 4123, 4543, 345, 56, 67, 878, 6564, 66565, 777, 66, 435, 657, 73456, 546345634, 565, 775, -11, 0, 0, 0, 434, 399, 4, 545, 345345, 453, 4523, 34, 567, 88, 23123, 5324, 45, 34, 45, 3412, 654, 542, 4123, 4543, 345, 56, 67, 878, 6564, 66565, 777, 66, 435, 657, 73456, 546345634, 565, 775, -11, 0, 0, 0, 434, 399, 4, 545, 345345, 453, 4523, 34, 567, 88, 23123, 5324, 45, 34, 45, 3412, 654, 542, 4123, 4543, 345, 56, 67, 878, 6564, 66565, 777, 66, 435, 657, 73456, 546345634, 565, 775, -11, 0, 0, 0, 434, 399, 4, 545, 345345, 453, 4523, 34, 567, 88, 23123, 5324, 45, 34, 45, 3412, 654, 542, 4123, 4543, 345, 56, 67, 878, 6564, 66565, 777, 66, 435, 657, 73456, 546345634, 565, 775, -11, 0, 0, 0, 434, 399, 4, 545, 345345, 453, 4523, 34, 567, 88, 23123, 5324, 45, 34, 45, 3412, 654, 542, 4123, 4543, 345, 56, 67, 878, 6564, 66565, 777, 66, 435, 657, 73456, 546345634, 565, 775, -11, 0, 0, 0, 434, 399, 4, 545, 345345, 453, 4523, 34, 567, 88, 23123, 5324, 45, 34, 45, 3412, 654, 542, 4123, 4543, 345, 56, 67, 878, 6564, 66565, 777, 66, 435, 657, 73456, 546345634, 565, 775, -11, 0, 0, 0, 434, 123, 34, 4565, 65, 55, 54};

        //随机生成示例数据 bbs
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            int intBounded = 1000 + ((int) (new Random().nextFloat() * (9999 - 1000)));
            list.add(intBounded);
        }
        Integer[] bbs = new Integer[list.size()];
        bbs = list.toArray(bbs);
        System.out.println(bbs.length + "个随机元素使用快排");
        long time = System.currentTimeMillis();
        a = select(bbs);
        System.out.println("执行时间是：" + (System.currentTimeMillis() - time));
//        System.out.print("{");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//            System.out.print(",");
//        }
//        System.out.println("}");
        System.out.println("进行了" + b + "次元素大小判断");
    }


    public static Integer[] select(Integer[] array) {

        if (array.length == 2) {
            b++;
            if (array[0] > array[1]) {
                return new Integer[]{array[1], array[0]};
            } else {
                return new Integer[]{array[0], array[1]};
            }
        } else if (array.length <= 1) {
            return array;
        } else {
            int a = array[0];
            ArrayList<Integer> u = new ArrayList<>();
            ArrayList<Integer> d = new ArrayList<>();
            for (int i = 1; i < array.length; i++) {
                b++;
                if (array[i] > a) {
                    u.add(array[i]);
                } else {
                    d.add(array[i]);
                }
            }

//            Integer[] uu = select((Integer[]) u.toArray());
//            Integer[] dd = select((Integer[]) d.toArray());

            Integer[] uu = new Integer[u.size()];
            uu = u.toArray(uu);
            uu = select(uu);

            Integer[] dd = new Integer[d.size()];
            dd = d.toArray(dd);
            dd = select(dd);

            ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(dd));
            arrayList.add(array[0]);
            arrayList.addAll(Arrays.asList(uu));

            Integer[] res = new Integer[arrayList.size()];

            return arrayList.toArray(res);
        }

    }
}
