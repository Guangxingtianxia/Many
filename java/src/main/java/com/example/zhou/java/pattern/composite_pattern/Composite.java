package com.example.zhou.java.pattern.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/5/31  11:34
 * @Desc : 具体枝干节点
 */

public class Composite extends Component
{
    private List<Component> components = new ArrayList<>();

    public Composite(String name)
    {
        super(name);
    }

    @Override
    public void doSomething()
    {
        System.out.println("父类的name：" + name);

        if (components != null)
        {
            for (Component c : components)
            {
                c.doSomething();
            }
        }

    }

    public void addChild(Component child)
    {
        components.add(child);
    }

    public void removeChild(Component child)
    {
        components.remove(child);
    }


    public Component getChildren(int index)
    {
        return components.get(index);
    }


}
