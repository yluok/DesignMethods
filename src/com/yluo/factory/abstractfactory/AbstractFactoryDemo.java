package com.yluo.factory.abstractfactory;

/**
 * 抽象工厂测试类
 * 缺点：
 * 1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂
 * 的接口。
 * 2、增加了系统的抽象性和理解难度。
 * 3、不符合程序的开闭原则，但该模式依旧有应用
 * 4、没增加一个产品，都需要从顶级工厂开始重写，适用于复杂关系实例的开发
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Inote note = factory.createInote();
        note.edit();
        Ivedio vedio = factory.createIvedio();
        vedio.record();


        CourseFactory factory1 = new PythonCourseFactory();
        Inote note1 = factory1.createInote();
        note1.edit();
        Ivedio vedio1 = factory1.createIvedio();
        vedio1.record();
    }
}
