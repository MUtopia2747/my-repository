package com.wu.test;


import com.wu.polymorphism.RandomShapeGenerator;
import com.wu.polymorphism.Shape;

/**
 * @description 2017-8-8下午7:11:17
 * @com.wu.test
 */
public class MainClass {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shape : s) {
            shape.draw();
        }
    }
}
