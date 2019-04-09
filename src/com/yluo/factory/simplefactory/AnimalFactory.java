package com.yluo.factory.simplefactory;

/**
 * 简单工厂类，用于生产各个具体动物实例
 * 优点：关系简单，容易实现
 * 缺点：不符合开闭原则，扩展性差，每次新类创建，都需要修改该工厂
 */
public class AnimalFactory {

    //方式一：通过传入参数，判断参数类型来决定生产哪种动物实例
    /*public Animal getInstance(String name) {
        if("dog".equals(name)) {
            return new Dog();
        }else if("cat".equals(name)) {
            return new Cat();
        }else {
            return null;
        }
    }*/

    //方式一的变形：传入参数修改为需要实例化类的全限定名
  /* public Animal getInstance(String clazzName) {

        try {
            if(clazzName != null || !clazzName.trim().equals("")) {
                return (Animal) Class.forName(clazzName).newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    //方式二：解决上述方式参数容易出错的问题
    public Animal getInstance(Class clazz) {
        try {
            if(clazz != null) {
                return (Animal) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
