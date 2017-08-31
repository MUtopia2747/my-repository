package com.wu.inherit;

/**
 * @description 2017-8-14下午1:59:32
 * @com.wu.test
 * @deprecated 代理
 */
public class ProxyClass extends FatherClass {
    private String name = null;

    public ProxyClass(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
