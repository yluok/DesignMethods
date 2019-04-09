package com.yluo.singleton.hungry;

import com.yluo.singleton.hungry.Hungry;

/**
 * 饿汉式测试类
 */
public class HungryDemoTest {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    //用于测试是否是单例
    public static void demo1() {
        System.out.println("----单例测试开始-------");
        Hungry hungry = Hungry.getInstance();
        System.out.println(hungry);
        Hungry hungry1 = Hungry.getInstance();
        System.out.println(hungry1);
        System.out.println("----单例测试结束-------");
    }

    //多线程测试
    public static void demo2() {
        System.out.println("-------单例多线程测试开始-------");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Hungry hungry = Hungry.getInstance();
                System.out.println(hungry);
            }
        },"thread-0");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Hungry hungry = Hungry.getInstance();
                System.out.println(hungry);
            }
        },"thread-1");
        t1.start();
        t2.start();
    }
}
