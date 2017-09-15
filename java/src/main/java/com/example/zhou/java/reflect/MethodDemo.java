package com.example.zhou.java.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/9/15  9:05
 * @Desc : 通过反射来了解泛型的本质
 */

public class MethodDemo
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");

        // 第一个，集合的泛型，是为了防止你错误输入的
        Class c1 = list.getClass();
        Class c2 = list1.getClass();

        System.out.println(c1==c2);
        // 反射的操作都是编译之后的操作
        // c1==c2 结果，说明编译之后的集合泛型，是去泛型化的，
        // java 中的集合泛型，是为了防止错误输入的，只在编译阶段有效，
        // 绕过编译就无效了，
        // 可以通过方法的反射来操作
        try
        {
            Method m = c2.getMethod("add",Object.class);

            // 绕过了编译操作，就绕过了泛型
            m.invoke(list1,20);

            System.out.println(list1);

//            for (String s : list1)
//            {
//                System.out.println(s);
//            }
            // 以上遍历会出错，因为数据类型是不一样的。会抛异常--类型转换错误

        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }


    }
}
