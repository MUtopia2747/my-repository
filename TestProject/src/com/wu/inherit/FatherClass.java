package com.wu.inherit;

/**
 * @description 2017-8-8下午7:13:02
 * @com.wu.test
 */
public class FatherClass {
    private int test_private = 0;
    protected String test_protected = null;
    public int test_public = 0;

    public FatherClass() {
        System.out.println("the fatherclass is used!");
    }

    private void setPrivate(int value) {
        test_private = value;
    }

    public int getPrivate() {
        return test_private;
    }

    protected void setProtected(String str) {
        test_protected = str;
    }

    public String getProtected() {
        return test_protected;
    }

    public void setPublic(int value) {
        test_public = value;
    }

    public int getPublic() {
        return test_public;
    }
}
