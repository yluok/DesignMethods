package com.yluo.factory.factory;

/**
 * 实例类AICourse类对应的生产工厂
 */
public class AICourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new AICourse();
    }
}
