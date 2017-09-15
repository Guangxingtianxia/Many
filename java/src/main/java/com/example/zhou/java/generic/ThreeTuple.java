package com.example.zhou.java.generic;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/16  17:06
 * @Desc :
 */

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>
{

     public  final C third ;

    public ThreeTuple(A first, B second,C third)
    {
        super(first, second);
        this.third = third;
    }


    @Override
    public String toString()
    {
        return "ThreeTuple{" +
                "third=" + third +
                '}';
    }
}
