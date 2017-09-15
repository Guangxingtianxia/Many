package com.example.zhou.java.generic;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/16  16:17
 * @Desc : 现在的H2 可以存储任意类型，
 */


public class Holder2
{
    private Object a;

    public Holder2(Object a)
    {
        this.a = a;
    }

    public Object getA()
    {
        return a;
    }

    public void setA(Object a)
    {
        this.a = a;
    }

    public static void main(String[] args)
    {
        Holder2 h2 = new Holder2(new Automoile());
        Automoile a = (Automoile) h2.getA();
        h2.setA("NOt an Automobile");
        String s = (String) h2.getA();
        Integer x = (Integer) h2.getA();



    }
}
