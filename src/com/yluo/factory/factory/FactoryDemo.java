package com.yluo.factory.factory;

/**
 * 工厂设计模式测试类
 * 工厂方法适用于以下场景：
 * 1、创建对象需要大量重复的代码。
 * 2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
 * 3、一个类通过其子类来指定创建哪个对象。
 * 工厂方法也有缺点：
 * 1、类的个数容易过多，增加复杂度。
 * 2、增加了系统的抽象性和理解难度
 * 3、每增加一个实例类，就创建一个实例工厂和实例类即可
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse jc = factory.create();
        jc.reord();

        ICourseFactory factory1 = new AICourseFactory();
        ICourse jc1 = factory1.create();
        jc1.reord();
    }
}
