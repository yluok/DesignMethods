package com.yluo.singleton.antireflect;

import com.yluo.singleton.lazy.DoubleCheckLazy;

/**
 * 懒汉式之双重检测方式+防反射攻击
 *
 */
public class DoubleCheckLazyDefRef {
    //提供一个标志，用于标记只能从getInstance这个方法中才能获取到该类的实例
    private static boolean flag =false;
    private DoubleCheckLazyDefRef(){
        if(!flag) {
            throw new RuntimeException("请从getInstance方法获取实例");
        }
    }

    private static DoubleCheckLazyDefRef doubleCheckLazy;

    public  static DoubleCheckLazyDefRef getInstance() {

        if(doubleCheckLazy == null) {
            synchronized (DoubleCheckLazy.class) {
                if(doubleCheckLazy == null) {
                    //将标志设置为true，这样我们就可以调用无参构造方法来实现创建实例了
                    flag = true;
                    doubleCheckLazy = new DoubleCheckLazyDefRef();
                    //创建完成后，重置该标识符
                    flag = false;
                }
            }
        }
        return doubleCheckLazy;
    }
}
