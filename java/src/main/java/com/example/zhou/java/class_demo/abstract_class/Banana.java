package com.example.zhou.java.class_demo.abstract_class;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/9/25  19:03
 * @Desc :
 */

public class Banana extends Fruit
{
    protected Banana()
    {
        System.out.println("实例化子类 Banana");

    }


    @Override
    protected void toPlant()
    {
        System.out.println("Plant a Banana");

    }

    @Override
    protected void toEat()
    {
        System.out.println("子类 Eat a Banana");

    }


}
