package com.example.zhou.java.pattern.composite_pattern;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/5/31  16:43
 * @Desc : 具体叶子节点
 */

public class Leaf extends Component
{
    public Leaf(String name)
    {
        super(name);
    }

    @Override
    public void doSomething()
    {
        System.out.println("Leaf_name:"+name);
    }
}
