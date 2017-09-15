package com.example.zhou.java.annotationdemo.csdn;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/14  18:27
 * @Desc :
 */


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 本例子旨在使用自定义注解为实体打上标记，为自动生成 sql 提供依据，模拟 hibernate 的注解，至于注解的原理自己搜吧
 */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table
{
    String value() default "";
}
