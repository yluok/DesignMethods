package com.yluo.singleton.lazy;

/**
 * 一个工具类：用于模拟多线程，测试懒汉式线程不安全问题的
 */
public class Excutor implements  Runnable{
    @Override
    public void run() {
       // SimpleLazy lazy = SimpleLazy.getInstance();
       // SynchronizedLazy lazy = SynchronizedLazy.getInstance();
       DoubleCheckLazy lazy = DoubleCheckLazy.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);
    }
}
