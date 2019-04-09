package com.yluo.singleton.antireflect;

/**
 * 解决单例模式之内部类方式中被反射攻击的问题
 */
public class InnerClassSingletonDefRef {
    //1、私有化其构造方法
    private InnerClassSingletonDefRef() {
        if(InnerClassHolder.lazy != null) {
            throw new RuntimeException("不允许使用反射实例化");
        }
    }

    //2、创建一个获取到该类单例的入口方法
    //static 能通过类.方式调用，因其构造方法已被私有化
    //final 保证其不能被重写
    public static final InnerClassSingletonDefRef getInstance() {

        return InnerClassHolder.lazy;
    }

    //3、创建一个内部类,该类只有在被调用时才会初始化
    private static class InnerClassHolder{
        public static final InnerClassSingletonDefRef lazy = new InnerClassSingletonDefRef();
    }
}
