package com.example.zhou.java.annotationdemo;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/17  16:23
 * @Desc :
 */

public @interface Uniqueness
{
    int value() default 0;

    String name() default "";

    Constraints constraints() default @Constraints(unique = true);
}
