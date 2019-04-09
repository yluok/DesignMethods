package com.yluo.prototype.deepclone;

import java.util.Date;

/**
 * 猴子类
 */
public class Monkey {
    private Date birthday;
    private String height;
    private int weight;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
