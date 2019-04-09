package com.yluo.factory.abstractfactory;

public class PythonCourseFactory implements CourseFactory{
    @Override
    public Inote createInote() {
        return new PythonNote();
    }

    @Override
    public Ivedio createIvedio() {
        return new PythonVedio();
    }
}
