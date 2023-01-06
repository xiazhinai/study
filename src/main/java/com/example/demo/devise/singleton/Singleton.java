package com.example.demo.devise.singleton;


//单例实现---最简单实现 --饿汉模式
public class Singleton {

    //私有构造函数 使其他的所有对象操作的Singleton的实例是一个,
    //就是下面的singleton
    private Singleton() {
    }

    static Singleton singleton;

    //获得单例的唯一实例
    //当其他对象需要操作该类的方法时,因为没法自己new生成 需要一个公共的函数来获得这个类的实例
    public static Singleton getSingleton() {
        //当有对象调用的时候才会真正的生成对象.不然就不会生成. ---懒加载  但是系统特高并发情况下不可用这种写法
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    //具体的业务方法 此处假设是保存订单
    public void saveOrder(){
        System.out.println("订单保存成功");
    }
}
