package com.example.zhou.java.pattern.composite_pattern;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/5/31  16:44
 * @Desc :
 */

public class Client
{
    public static void main(String[] args)
    {

        // 根节点
        Composite root = new Composite("root");

        //构造两个枝干节点
        Composite branch1 = new Composite("branch1");
        Composite branch2 = new Composite("branch2");

        // 构造两个叶子节点
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");


        // 叶子放到枝干节点中
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        // 将枝干节点放到根节点里
        root.addChild(branch1);
        root.addChild(branch2);


        root.doSomething();


    }
}
