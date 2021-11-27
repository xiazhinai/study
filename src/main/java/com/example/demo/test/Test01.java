package com.example.demo.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lyj
 * 血量和减伤  游戏收益数据测试
 */
@Slf4j
public class Test01 {
    public static void main(String[] args) {
        int hp = 30000;
        int hurt = 2000;
        System.out.println("基础血量=剩余血量==系数==剩余血量百分比");

        for (int i = 1; i < 100; i++) {
            double a =(double) (100+i)/100;
            double b =(double) (100-i)/100;

            hp = (int) (hp*a);
            System.out.printf("    %s   %s    %s   %s",hp,hp-(15*hurt),i,(double) (hp-(15*hurt))/hp);
            System.out.println();

            hp = 30000;
            hurt = (int) (hurt * b);
            System.out.printf("    %s   %s    %s   %s",hp,hp-(15*hurt),i,(double) (hp-(15*hurt))/hp);
            System.out.println();
            hurt = 2000;
        }
    }
}
