package com.yluo.factory.abstractfactory;

/**
 * java品牌产品的具体实现
 */
public class JavaNote implements  Inote{
    @Override
    public void edit() {
        System.out.println("Java记录笔记");
    }
}
