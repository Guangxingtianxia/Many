package com.example.zhou.java.annotationdemo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/17  15:36
 * @Desc : 编写注解处理器
 */

public class UseCaseTracker
{

    public static void main(String[] args)
    {

        List<Integer> useCase = new ArrayList<>();
        Collections.addAll(useCase,47,48,49,50);

        trackUseCases(useCase,PasswordUtils.class);

    }

    public static  void trackUseCases(List<Integer> useCases,Class<?> cl)
    {
        // 类中所有的方法。。
        for (Method m : cl.getDeclaredMethods())
        {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc !=null)
            {
                System.out.println("Found Use Case : "+uc.id()+
                " " +uc.description() );

                useCases.remove(new Integer(uc.id()));
            }

        }

        for (Integer useCase : useCases)
        {
            System.out.println("warning : Missing use case -->"+useCase);
        }

    }

}
