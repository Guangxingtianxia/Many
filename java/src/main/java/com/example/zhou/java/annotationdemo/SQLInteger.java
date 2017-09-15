package com.example.zhou.java.annotationdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/17  16:25
 * @Desc :
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger
{
    String name() default  "";
    Constraints constraints() default @Constraints;

}
