package com.yluo.singleton.inner;

/**
 * 单例模式之：内部类方式
 * 优点：解决了懒汉式的上锁影响多线程性能问题
 * 缺点：无法抵御被发射攻击问题
 * 特点：这种形式兼顾饿汉式的内存浪费，也兼顾 synchronized 性能问题
 */
public class InnerClassSingleton {
    //1、私有化其构造方法
    private InnerClassSingleton() {}

    //2、创建一个获取到该类单例的入口方法
    //static 能通过类.方式调用，因其构造方法已被私有化
    //final 保证其不能被重写
    public static final InnerClassSingleton getInstance() {
        return InnerClassHolder.lazy;
    }

    //3、创建一个内部类,该类只有在被调用时才会初始化
    private static class InnerClassHolder{
        public static final InnerClassSingleton lazy = new InnerClassSingleton();
    }
}
