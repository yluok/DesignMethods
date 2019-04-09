package com.yluo.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 * 测试结果：
 * 原始对象:com.yluo.prototype.simple.SimplePrototype@4554617c
 * 通过原型操作后的对象是：com.yluo.prototype.simple.SimplePrototype@74a14482
 * 原始对象中skill与原型操作后的skill一致吗:true
 * 通过测试可知：简单原型方式，获得的对象与原对象是不一样的，但是其内容引用是一样的，对象是
 * 不完整的深克隆，即：对象引用不同，但对象内容引用相同
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        SimplePrototype sp = new SimplePrototype();
        sp.setAge(18);
        sp.setName("JACK");
        List<String> skills = new ArrayList<>();
        sp.setSkills(skills);
        System.out.println("原始对象:" + sp);
        Client client = new Client();
        SimplePrototype sp2 = (SimplePrototype)client.createPrototype(sp);
        System.out.println("通过原型操作后的对象是：" + sp2);
        System.out.println("原始对象中skill与原型操作后的skill一致吗:" + (sp.getSkills() == sp2.getSkills()));
    }
}
