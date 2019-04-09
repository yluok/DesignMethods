package com.yluo.singleton.inner;
/**
 * 一个工具类：用于模拟多线程，测试线程安全问题的
 */
public class Excutor implements  Runnable{
    @Override
    public void run() {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
