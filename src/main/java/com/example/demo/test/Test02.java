package com.example.demo.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

public class Test02 {

    public static void main(String[] args) {
        System.out.println(String.valueOf("sgs").contains("sg"));
        System.out.println(Timestamp.valueOf("2022-04-09 19:06:28").getTime());

        BigDecimal bigDecimal = new BigDecimal((String)null).setScale(2, RoundingMode.HALF_UP);
        System.out.println(bigDecimal);
    }
}
