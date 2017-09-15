package com.example.zhou.java.sort;

import java.util.Arrays;

/**
 * Created by mr_zhou on 2017/4/2.
 */

public class Mianshi
{
    public static void main(String[] args)
    {
        int[] a = {13,35,56,34,65,34,6,324,6,454,76,67674,54};
        int [] b= {342,4541,5,46,357,5,324,653,47,5658,35,7543,64};
        int [] c = new int[a.length + b.length];



//        System.out.println("排序前："+a[0]);
        Arrays.sort(a);
        System.out.println("===============");
        Arrays.copyOf(b,a.length+b.length);

        for (int i = 0; i < b.length; i++)
        {
            System.out.println("排序后："+b[i]);
        }

        System.out.println("排序后："+a.toString());

    }
}
