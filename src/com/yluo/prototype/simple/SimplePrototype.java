package com.yluo.prototype.simple;

import java.util.List;

/**
 * 简单原型类
 * 我们提供了copy()方法，用于对外提供该对象的克隆操作，隐藏了set操作细节
 */
public class SimplePrototype implements Prototype{
    private String name;    //姓名
    private int age;       //年龄
    private List<String> skills;    //技能列表

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public Prototype copy() {
        SimplePrototype sp = new SimplePrototype();
        sp.setAge(this.age);
        sp.setName(this.name);
        sp.setSkills(this.getSkills());
        return sp;
    }
}
