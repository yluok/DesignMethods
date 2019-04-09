package com.yluo.factory.abstractfactory;

/**
 * 抽象工厂类，用于生产同一品牌的各种产品
 */
public interface CourseFactory {
    public Inote createInote();
    public Ivedio createIvedio();
}
