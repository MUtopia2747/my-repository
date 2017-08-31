package com.wu.polymorphism;

/**
 * @description 2017-8-14下午2:53:47
 * @com.wu.other
 */
public class Circle extends Shape {

    public void draw() {
        System.out.println("Circle.draw()");
    }

    public void erase() {
        System.out.println("Circle.erase()");
    }
}
