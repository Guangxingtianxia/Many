package com.example.zhou.java.annotationdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/17  11:07
 * @Desc : @Target d定义了你的注解用于什么地方使用，-->作用域
 *         @Retention 定义了注解在哪一个级别可用！
 *                      1：SOURCE 源码中
 *                      2:CLASS   类文件
 *                      3RUNTIME  运行时
 */
@Target(ElementType.METHOD)            // 只限于 方法使用
@Retention(RetentionPolicy.RUNTIME)    //
public @interface Test
{

}
