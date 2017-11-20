package com.example.zhou.java.class_demo.abstract_class;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/9/25  19:02
 * @Desc :
 */

public abstract class Fruit
{
    protected Fruit()
    {
        System.out.println("实例化父类");
       // toPlant();
       //  toEat();
    }

    protected abstract void toPlant();
    protected abstract void toEat();

}
