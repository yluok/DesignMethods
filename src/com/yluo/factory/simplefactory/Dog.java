package com.yluo.factory.simplefactory;
 /**
 *  Animal接口实例类一：狗类
 */
public class Dog implements  Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
