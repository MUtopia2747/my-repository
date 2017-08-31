package com.wu.polymorphism;

import java.util.Random;

/**
 * @description 2017-8-14下午3:02:08
 * @com.wu.polymorphism
 */
public class RandomShapeGenerator {

    Random random = new Random(50);

    public Shape next() {
        switch (random.nextInt(3)) {
        default:
        case 0:
            return new Circle();
        case 1:
            return new Square();
        case 2:
            return new Triangle();
        }
    }
}
