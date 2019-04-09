package com.yluo.prototype.bussiness;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 用于前端展示的类，对应的是record类
 * 主要是将其中的账户id全部转换成对应的name
 * 这里我们添加了一个clone方法，完成对父类Record中属性的全部复制
 * @author yluo0
 */
public class RecordShow extends Record{
    private String inAccountName;			//进账账户名，这两个是需要显示在页面上的值
    private String outAccountName;			//出账账户名

    public String getInAccountName() {
        return inAccountName;
    }

    public void setInAccountName(String inAccountName) {
        this.inAccountName = inAccountName;
    }

    public String getOutAccountName() {
        return outAccountName;
    }

    public void setOutAccountName(String outAccountName) {
        this.outAccountName = outAccountName;
    }


    //克隆父类的属性
    protected static RecordShow clone(Object father) throws CloneNotSupportedException {
        RecordShow recordShow = new RecordShow();
        // 获取父类对象
        Class fatherClazz = father.getClass();

        // 获取父类的所有属性
        Field[] fields = fatherClazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i]; // 获取到每一个属性
            field.setAccessible(true); // 设置其为可见
            String fieldName = field.getName(); // 获取到属性所对应的名字
            try {
                // 根据名字，获取到其所对对应的方法
                Method m = fatherClazz.getMethod("get" + upperHeadChar(fieldName));
                // 执行方法获取到属性值
                Object value = m.invoke(father);
                // 将该属性设置到子类上
                field.set(recordShow, value);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return recordShow;
    }

    // 将首字母大写返回
    private static String upperHeadChar(String fieldName) {
        return fieldName.substring(0, 1).toUpperCase() + fieldName.subSequence(1, fieldName.length());
    }

    @Override
    public String toString() {
        return "RecordShow{" +
                "inAccountName='" + inAccountName + '\'' +
                ", outAccountName='" + outAccountName + '\'' +
                "} " + super.toString();
    }
}
