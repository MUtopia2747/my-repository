package com.wu.personaltest;

import java.util.LinkedList;

import com.wu.personaltest.ContactTest.ITest;

/**
 * @description 2017-8-14下午5:17:18
 * @com.wu.personaltest
 */
public abstract class SelfTest<T extends ITest, V> implements Test<T> {

    private LinkedList<T> mTest = new LinkedList<>();

    @SuppressWarnings("unused")
    private LinkedList<V> mTestTwo = new LinkedList<>();

    public void register(T t) {
        if (mTest == null) {
            return;
        }
        if (!mTest.contains(t)) {
            mTest.add(t);
        }
    }

    public void unregister(T t) {
        if (mTest == null) {
            return;
        }
        if (!mTest.contains(t)) {
            mTest.remove(t);
        }
    }

    @Override
    public T getValue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void test() {
        // TODO Auto-generated method stub

    }

}
