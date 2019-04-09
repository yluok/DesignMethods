package com.yluo.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 懒汉式的测试demo
 */
public class LazyDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Excutor());
        Thread t2 = new Thread(new Excutor());
        t1.start();
        t2.start();
    }
}
