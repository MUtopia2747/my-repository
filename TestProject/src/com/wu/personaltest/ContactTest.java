package com.wu.personaltest;

/**
 * @description 2017-8-14下午5:26:29
 * @com.wu.personaltest
 */
public interface ContactTest {

    public interface ITest extends Test<ITestTwo> {

    }

    public interface ITestTwo extends TestTwo<ITest> {

    }
}
