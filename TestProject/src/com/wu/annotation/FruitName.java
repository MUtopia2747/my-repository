package com.wu.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description 2017-8-11上午11:18:50
 * @com.wu.test
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    
    /*
     * 水果名称
     * 
     * */
    String value() default "";
}
