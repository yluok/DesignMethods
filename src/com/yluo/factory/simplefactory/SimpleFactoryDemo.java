package com.yluo.factory.simplefactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        //方式一：该方式存在实参字符串写错的风险，不推荐使用
       /* AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getInstance("dog");
        animal.eat();
        System.out.println("-----------------------");
        AnimalFactory animalFactory1 = new AnimalFactory();
        Animal animal1 = animalFactory1.getInstance("cat");
        animal1.eat();*/

        //方式一的变形:同样存在相同的风险
       /*AnimalFactory animalFactory = new AnimalFactory();
        Animal animal_dog = animalFactory.getInstance("com.yluo.factory.simplefactory.Dog");
        animal_dog.eat();
        System.out.println("-------------------------");
        Animal animal_cat = animalFactory.getInstance("com.yluo.factory.simplefactory.Cat");
        animal_cat.eat();
        System.out.println("-------------方式二---------------");*/
        //方式二：传入参数为类的class
        AnimalFactory animalFactory_class = new AnimalFactory();
        Animal animal_dog2 = animalFactory_class.getInstance(Dog.class);
        animal_dog2.eat();
        System.out.println("-------------------");
        Animal animal_cat2 = animalFactory_class.getInstance(Cat.class);
        animal_cat2.eat();

    }
}
