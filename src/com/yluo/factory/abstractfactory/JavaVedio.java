package com.yluo.factory.abstractfactory;

/**
 * java品牌的产品的具体实现
 */
public class JavaVedio implements  Ivedio{
    @Override
    public void record() {
        System.out.println("Java的录制视频");
    }
}
