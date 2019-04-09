package com.yluo.singleton.register.Enum;

/**
 * 注册式之枚举式
 */
public enum  EnumSingleton {
    //创建一个枚举选项，唯一
    INSTANCE;
    //创建一个我们需要实例的对象，私有化即可，并提供set和get方法
    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    //提供一个获取到该枚举的方法
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
