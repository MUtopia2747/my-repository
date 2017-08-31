package com.wu.generics;

import java.util.HashMap;

/**
 * @description 2017-8-24下午2:16:33
 * @com.wu.generics
 */
public class Fibonacci implements Generator<Integer> {

    private int count = 0;

    @Override
    public Integer next() {
        // TODO Auto-generated method stub
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
