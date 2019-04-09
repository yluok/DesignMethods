package com.yluo.prototype.deepclone;

import java.io.*;
import java.util.Date;

/**
 * 齐天大圣类
 */
public class QiTianDaSheng extends  Monkey implements Cloneable, Serializable {
    //金箍棒
    private JinGuBang jinGuBang;

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    //齐天大圣变分身
    private Object deepClone() {
        try{
            //序列化
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.close();
            //反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            bos.close();
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();
            copy.setBirthday(new Date());
            bis.close();
            ois.close();
            return copy;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //浅克隆
    public QiTianDaSheng shadowClone(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.setJinGuBang(target.getJinGuBang());
        qiTianDaSheng.setBirthday(new Date());
        qiTianDaSheng.setHeight(target.getHeight());
        qiTianDaSheng.setWeight(target.getWeight());
        return qiTianDaSheng;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }
}
