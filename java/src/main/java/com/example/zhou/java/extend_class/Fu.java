package com.example.zhou.java.extend_class;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/29  14:18
 * @Desc : 我擦，好处是什么，他娘的，完全没看出来啊！
 */

public class Fu
{
    public static void main(String[] args)
    {
        int viewId = 14;
        setContentView(viewId);

    }

    public static void setContentView(int viewId)
    {

        System.out.println("ttttt--->调用的是父类的setContnetView,viewId 是-->: " + viewId);

    }
}
