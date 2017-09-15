package com.example.zhou.java.overloaded;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/10  16:27
 * @Desc :
 */

public class Overriding
{
    public static void main(String[] args)
    {
        Wine[] wines = {new Wine() ,new SparklingWine(), new Champagne()};

        for (Wine wine : wines)
        {
            System.out.println(wine.name());
        }
    }
}
