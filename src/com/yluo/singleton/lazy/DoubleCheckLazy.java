package com.yluo.singleton.lazy;

/**
 * 懒汉式实现方式之三：sychronized + 双重检测方式
 * 优点：锁的范围变小了，减少了多线程堵塞的程度
 * 缺点：懒汉式实现方式一至三都存在被反射攻击的可能；仍旧有上锁，多线程性能没优化到最佳
 */
public class DoubleCheckLazy {

    private DoubleCheckLazy(){}

    private static DoubleCheckLazy doubleCheckLazy;

    public  static DoubleCheckLazy getInstance() {


        if(doubleCheckLazy == null) {
            //synchronized不放在第一个if语句外面的原因：锁的范围比放在此处大
            synchronized (DoubleCheckLazy.class) {
                //双重检测，此处还进行if判断的原因：多个线程都进过了第一道if语句判断，尽管此处是线程安全的，但是由于多个线都进过了第一道门槛，如果
                //不设置再次判断，那么这些同时过第一道if门槛的线程还都可以各自创建自己的对象出来
                if(doubleCheckLazy == null) {
                    doubleCheckLazy = new DoubleCheckLazy();
                }
            }
        }
        return doubleCheckLazy;
    }
}
