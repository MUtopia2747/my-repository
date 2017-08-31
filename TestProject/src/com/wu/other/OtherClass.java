package com.wu.other;

import com.wu.inherit.FatherClass;

/**
 * @description 
 * 2017-8-8下午7:21:42
 * @com.wu.other
 */
public class OtherClass extends FatherClass implements TestInterface{

    public OtherClass(){
        System.out.println("the otherclass is used!");
        setProtected("test");
    }

    @Override
    public void test() {
        // TODO Auto-generated method stub
        System.out.println(">>>>>>test()");
    }
    
    
}


