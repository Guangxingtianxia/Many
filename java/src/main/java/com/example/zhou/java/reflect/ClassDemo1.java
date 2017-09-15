package com.example.zhou.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/11  15:38
 * @Desc :
 */

public class ClassDemo1

{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {

        Foo foo1 = new Foo();
        Class c1 = Foo.class;

        // 类也是对象，是CLass 类的对象
        // 这个对象，我们称之为该类的类类型
        // Foo 类类型
        Class c2 = foo1.getClass();

        System.out.println(c1==c2);

        // 第三种变大方式
        Class c3 = Class.forName("com.example.zhou.java.reflect.Foo");
        System.out.println("c2==c3");
        System.out.println("*****华丽的分割线*********************************");

        Foo foo2 = (Foo) c1.newInstance();
        foo2.print();


        Field[] fs = c1.getDeclaredFields();

        // 定义一个可变长的字符串，用来储存属性
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c1.getModifiers())+" class "+ c1.getSimpleName()+" {\n");

        // 里面的每一个属性
        for (Field field : fs)
        {
            // 空格
            sb.append("\t") ;
            // 获得属性的修饰符，例如：public private
            sb.append(Modifier.toString(c1.getModifiers()) +" " );
            // 属性的类型的名字
            sb.append(field.getType().getSimpleName()+" ");
            // 属性的名字 + 回车
            sb.append(field.getName()+";\n");

        }
        sb.append("}");
        System.out.println(sb);

    }
}
