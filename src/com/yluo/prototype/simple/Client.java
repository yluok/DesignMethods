package com.yluo.prototype.simple;

public class Client {
    public Prototype createPrototype(Prototype prototype) {
        return prototype.copy();
    }
}
