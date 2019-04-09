package com.yluo.prototype.deepclone;

import java.io.Serializable;

/**
 * 金箍棒
 */
public class JinGuBang implements Serializable {
    private int length;
    private  int weight;

    public JinGuBang() {
    }

    public JinGuBang(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public void bigger() {
        this.length = this.length * 2;
        this.weight = this.weight * 2;
    }

    public void smalller() {
        this.length = this.length/2;
        this.weight = this.weight / 2;
    }
}
