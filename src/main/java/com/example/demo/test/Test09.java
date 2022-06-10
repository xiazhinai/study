package com.example.demo.test;


import lombok.SneakyThrows;

/**
 * 模拟多线程 操作静态对象
 */
public class Test09 {

    public  static    long count;

    @SneakyThrows
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                new Test09().run();
            }).start();
        }
        Thread.sleep(5000);
        System.out.println(count);
        main(args);
    }

    public  void run(){
        for (int i = 0; i < 1000; i++) {
            ++count;
        }
    };
}
