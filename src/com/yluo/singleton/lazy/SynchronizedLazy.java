package com.yluo.singleton.lazy;

/**
 * 懒汉式实现方式之二：入口方法上加synchronized关键字
 * 优点：解决了方式一的线程安全问题
 * 缺点：由于在方法上加了类锁，执行效率低，多线程都会卡在该方法的调用上
 */
public class SynchronizedLazy {

    private SynchronizedLazy(){}

    private static SynchronizedLazy synchronizedLazy;

    public synchronized static SynchronizedLazy getInstance() {     //此处方法上加了关键字synchronized

        if(synchronizedLazy == null) {
            synchronizedLazy = new SynchronizedLazy();
        }
        return synchronizedLazy;
    }
}
