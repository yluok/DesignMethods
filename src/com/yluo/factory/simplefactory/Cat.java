package com.yluo.factory.simplefactory;

/**
 * Animal接口实例类一：猫类
 */
public class Cat implements  Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
