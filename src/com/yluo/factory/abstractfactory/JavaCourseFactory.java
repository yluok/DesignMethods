package com.yluo.factory.abstractfactory;

public class JavaCourseFactory implements CourseFactory{
    @Override
    public Inote createInote() {
        return new JavaNote();
    }

    @Override
    public Ivedio createIvedio() {
        return new JavaVedio();
    }
}
