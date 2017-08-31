package com.wu.personaltest;

import com.wu.personaltest.ContactTest.ITest;
import com.wu.personaltest.ContactTest.ITestTwo;

/**
 * @description 2017-8-14下午5:47:11
 * @com.wu.personaltest
 */
public class ImplTest extends SelfTest<ITest, ITestTwo> {
    private static ImplTest mInstance;

    private ImplTest() {

    }

    public static ImplTest getInstance() {
        if (null == mInstance) {
            mInstance = new ImplTest();
        }
        return mInstance;
    }
    
    
}
