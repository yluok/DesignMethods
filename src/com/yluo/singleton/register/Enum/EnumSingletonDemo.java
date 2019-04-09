package com.yluo.singleton.register.Enum;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试类
 */
public class EnumSingletonDemo {
    public static void main(String[] args) {
        EnumSingleton es1 = EnumSingleton.getInstance();
        es1.setData(new Object());
        try {
            //序列化
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(es1);
            oos.close();
            fos.close();
            //反序列化
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            EnumSingleton es2 = (EnumSingleton) ois.readObject();
            System.out.println("序列化之前为：" + es1.getData());
            System.out.println("序列化之后为" + es2.getData());
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("--------------反射攻击测试----------------");
        //反射攻击测试
        try{
            Class clazz = Class.forName("com.yluo.singleton.register.Enum.EnumSingleton");
           // EnumSingleton enumSingleton = (EnumSingleton) clazz.newInstance();
            Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton) constructor.newInstance("INSTANCE",0);
            System.out.println(enumSingleton);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
