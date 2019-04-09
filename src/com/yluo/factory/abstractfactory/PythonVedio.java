package com.yluo.factory.abstractfactory;

/**
 * python品牌的产品具体实现
 */
public class PythonVedio implements  Ivedio{
    @Override
    public void record() {
        System.out.println("Python的录制视频");
    }
}
