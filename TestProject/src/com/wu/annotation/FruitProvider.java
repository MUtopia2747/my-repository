package com.wu.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description 2017-8-11下午3:05:04
 * @com.wu.test
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /*
     * 供应者ＩＤ
     */
    public int id() default -1;

    /*
     * 供应者名称
     */
    public String name() default "";

    /*
     * 供应者地址
     */
    public String address() default "";
}
