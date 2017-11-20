package com.example.zhou.java.class_demo.abstract_class;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/9/25  19:07
 * @Desc :
 */

public class Orange  extends Fruit
{

    public Orange() {
        System.out.println("实例化子类 Orange");
    }

    @Override
    protected void toPlant()
    {
        System.out.println("Eat a Orange");

    }

    @Override
    protected void toEat()
    {
        System.out.println("Plant a Orange");

    }
}
