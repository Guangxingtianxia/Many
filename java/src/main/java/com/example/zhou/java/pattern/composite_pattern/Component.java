package com.example.zhou.java.pattern.composite_pattern;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/5/31  11:24
 * @Desc : 组件
 */

public abstract  class Component
{
    protected String name ;

    public Component(String name)
    {
        this.name = name;
        System.out.println("抽象父类的构造方法，被调用======>"+name);
    }

    /**
     * 具体逻辑方法，由子类来实现
     */
    public abstract void doSomething();




}
