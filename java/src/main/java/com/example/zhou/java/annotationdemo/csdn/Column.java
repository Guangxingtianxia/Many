package com.example.zhou.java.annotationdemo.csdn;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/14  18:29
 * @Desc :
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column
{
    String value() default "";
}
