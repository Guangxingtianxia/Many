package com.example.zhou.java.reflect;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/11  15:38
 * @Desc :
 */

public class Foo
{
    private  String  str1= " String 的成员变量";
    private  int a = 100;
    private  int b = 35;



    public   void print()
    {
        System.out.println("Foo是通过java的反射-》Object obj = xx.newIndtance()");
    }

    private  void test()
    {
        System.out.println("Foo--test method");
    }
}
