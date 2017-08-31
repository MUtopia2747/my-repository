package com.wu.generics;

/**
 * @description 2017-8-10下午3:44:10
 * @com.wu.test
 */
public class GenericsClass<T>{
    private T t;

    public GenericsClass(T t) {
        this.t = t;
    }

    public void setValue(T t) {
        this.t = t;
    }

    public T getValue() {
        return t;
    }
}
