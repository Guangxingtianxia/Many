package com.example.zhou.java.generic;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/16  16:28
 * @Desc : 与其使用Object 我们更喜欢暂时不指定类型，而是稍后在具体使用什么类型！
 *          要达到这个目的需要使用类型参数，
 */

public class Holder3<T>
{
    private  T a;

    public Holder3(T a)
    {
        this.a = a;
    }

    public T getA()
    {
        return a;
    }

    public void setA(T a)
    {
        this.a = a;
    }

    public static void main(String[] args)
    {
        Holder3<Automoile> h3 = new Holder3<>(new Automoile());
        Automoile a = h3.getA(); // 不用强转了。。
    }


}
