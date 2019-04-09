package com.yluo.singleton.register.container;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 注册单例之容器缓存方式
 * 优点：可以创建大量的单例对象
 * 缺点：不加锁，线程不安全；加锁后，对性能有些牺牲
 */
public class ContainerSingleton {
    private ContainerSingleton() {}
    //创建一个容器
    private final static ConcurrentHashMap<String,Object> ioc = new ConcurrentHashMap<>();
    public static Object getBean(String className) {
            //判断容器中是否有该对象
        synchronized (ioc) {            //
            if(ioc.containsKey(className)) {        //如果有就直接返回
                return ioc.get(className);
            }else {         //如果没有，就创建出该对象，将其放入容器中，然后返回该对象
                try {
                    //创建出实例
                    Object object = Class.forName(className).newInstance();
                    //放入容器
                    ioc.put(className,object);
                    //返回该对象
                    return object;
                }catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
    }
}
