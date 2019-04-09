package com.yluo.singleton.hungry;

/**
 * 饿汉式
 * 优点：线程安全（返回的实例对象是final的，决定了其不可能被改写）
 * 缺点：类在加载时，该类的实例就创建了，存在占用内存空间的缺点（某些时候并不需要该实例，但是该实例却存在）
 */
public class Hungry {
    //1、私有化其无参构造方法，防止通过new的方式创建该类的实例对象
    private Hungry(){}
    //2、提供一个静态变量，指向其实例对象
    //方式一：
    //private static final Hungry hungry = new Hungry();
    //方式二：采用静态代码块的方式初始化该静态变量
    private static final Hungry hungry;
    static {
        hungry = new Hungry();
    }
    //3、对外提供一个获取该实例的入口，注意该方法必须是static
    public static Hungry getInstance() {
        //由于是饿汉式，所以直接返回
        return hungry;
    }


}
