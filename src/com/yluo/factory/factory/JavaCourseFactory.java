package com.yluo.factory.factory;

/**
 * 实例类JavaCourse对应的生成工厂
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
