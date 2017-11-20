package com.example.zhou.java.class_demo.abstract_class;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/9/25  19:09
 * @Desc : 1:查看子类、抽象类的构造方法打印结果可知，实例化子类时先实例化父类。
 *         2:在抽象类的构造方法中调用了自己未实现的抽象方法，那么对应实例化的子类实现了此方法，
 *            在抽象类实例化之后，子类未实例化之前，抽象类可以调用子类实现的抽象方法。
 *         3: 不同的类实例化打印不同的抽象方法实现，java多态的一种表现形式。
 */

public class AbstractTest
{
    public static void main(String[] args)
    {
       Fruit fruit =  new Banana();
       // new Orange();

        fruit.toEat();

    }



}
