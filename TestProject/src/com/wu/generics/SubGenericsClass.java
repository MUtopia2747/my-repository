package com.wu.generics;


/**
 * @description 2017-8-10下午4:07:45 @
 */
public class SubGenericsClass<T, V> extends GenericsClass<T> {

    public final T t;

    public final V v;

    SubGenericsClass(T t, V v) {
        super(t);

        this.t = t;

        this.v = v;
    }

    public String toString() {
        return "(" + t + "," + v + ")";
    }
}
