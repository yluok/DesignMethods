package com.yluo.singleton.antireflect;

import com.yluo.singleton.inner.InnerClassSingleton;

/**
 * 一个工具类：用于模拟多线程，测试线程安全问题的
 */
public class Excutor implements  Runnable{
    @Override
    public void run() {
       // InnerClassSingletonDefRef instance = InnerClassSingletonDefRef.getInstance();
        DoubleCheckLazyDefRef instance = DoubleCheckLazyDefRef.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
