package com.yluo.singleton.register.container;

public class ContainerSingletonDemo {
    public static void main(String[] args) throws  Exception{
        int i = 0;
        while(i< 100) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Object cs3 = ContainerSingleton.getBean("java.lang.Object");
                    System.out.println(cs3);
                }
            });
            t1.start();
            i++;
        }
    }
}
