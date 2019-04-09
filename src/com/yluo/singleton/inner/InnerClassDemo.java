package com.yluo.singleton.inner;

import java.lang.reflect.Constructor;

/**
 * 测试类
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        //测试线程安全
        Thread t1 = new Thread(new Excutor());
        Thread t2 = new Thread(new Excutor());
        t1.start();
        t2.start();

        //测试能否被反射攻击
       try {
            Class clazz = Class.forName("com.yluo.singleton.antireflect.InnerClassSingletonDefRef");
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object object  = constructor.newInstance();
            System.out.println(object);
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
