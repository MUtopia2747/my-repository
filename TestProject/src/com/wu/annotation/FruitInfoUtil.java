package com.wu.annotation;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;

/**
 * @description 2017-8-11下午3:24:30
 * @com.wu.test
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = " 水果名称：";
        String strFruitColor = " 水果颜色：";
        String strFruitProvider = null;
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = (FruitColor) field
                        .getAnnotation(FruitColor.class);
                strFruitColor += fruitColor.toString();
                System.out.println(strFruitColor);
            }

            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName += fruitName.toString();
                System.out.println(strFruitName);
            }

            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = (FruitProvider) field
                        .getAnnotation(FruitProvider.class);
                strFruitProvider = "供应商ID :" + fruitProvider.id() + "供应商名称:"
                        + fruitProvider.name().toString() + "供应商地址:" +
                        fruitProvider.address().toString();
                System.out.println(strFruitProvider);
            }

        }
    }
}
