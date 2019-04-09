package com.yluo.singleton.register.container;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 防反射攻击测试：
 * 测试结果为：
 * java.lang.Object@4554617c
 * java.lang.Object@677327b6
 * java.lang.Object@677327b6
 * 发现：是可以被反射攻击的，其解决方法和饿汉式方式一致，同理，其也是能为序列化攻击的（不测试了），解决方法也同上
 * 当然可以将容器ioc直接设置成常量，这样就不允许重新创建容器后，就可以实现防反射了
 *
 */
public class AntiReflectContainerSingletonDemo {
    public static void main(String[] args) throws Exception {
        Object object2 = ContainerSingleton.getBean("java.lang.Object");
        System.out.println(object2);
        try {
            Class clazz = Class.forName("com.yluo.singleton.register.container.ContainerSingleton");
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Field field = clazz.getDeclaredField("ioc");
            field.setAccessible(true);
            field.set(ConcurrentHashMap.class,new ConcurrentHashMap<>());
            Method method  = clazz.getMethod("getBean",String.class);
            Object object = method.invoke(constructor.newInstance(),"java.lang.Object");
            System.out.println(object);
        }catch (Exception e) {
            e.printStackTrace();
        }
        Object object1 = ContainerSingleton.getBean("java.lang.Object");
        System.out.println(object1);
    }
    }
