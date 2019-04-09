package com.yluo.factory.abstractfactory;

/**
 * python品牌的产品具体实现
 */
public class PythonNote implements  Inote{
    @Override
    public void edit() {
        System.out.println("python记录笔记");
    }
}
