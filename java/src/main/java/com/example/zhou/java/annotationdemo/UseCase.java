package com.example.zhou.java.annotationdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/17  11:35
 * @Desc :
 */
@Target(ElementType.METHOD) // 作用在方法上
@Retention(RetentionPolicy.RUNTIME)// 运行时
public @interface UseCase
{
     int  id();
     String description () default  "no description";

}
