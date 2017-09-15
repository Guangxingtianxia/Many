package com.example.zhou.java.generic;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/16  16:45
 * @Desc : 2 维元组，他能够维持有2个对象
 */
public class TwoTuple<A,B>
{
    public final A first ;
    public  final B second;

    public TwoTuple(A first, B second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString()
    {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }



}
