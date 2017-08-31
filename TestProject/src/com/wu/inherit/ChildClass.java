package com.wu.inherit;

/**
 * @description 2017-8-8下午7:19:34
 * @com.wu.test
 */
public class ChildClass extends FatherClass {

    private int private_value = 0;

    private int childPublic = 0;

    public enum test{
        XIAMEN,BEIJING,SHANGHAI,MAERDAICI
    }
    
    public ChildClass() {
        System.out.println("the ChildClass is used!");
        setProtected("8888");
        setPublic(8);
    }

    public void setValue(int value) {
        private_value = value;
    }

    public int getValue() {
        return private_value;
    }

    public void setPublic(int value) {
        childPublic = value;
    }

    public int getPublic() {
        return childPublic;
    }
    
    public String getEnumValue(){
        test value = test.XIAMEN;
        return value.toString();
    }
}
