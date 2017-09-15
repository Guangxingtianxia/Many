package com.example.zhou.java.io.file;

import java.io.File;
import java.util.Arrays;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/9  10:53
 * @Desc :
 */

public class DirList
{
    public static void main(String[] args)
    {

        File path = new File(".");
        String[] list;
        if (args.length == 0)
        {
            list = path.list();
        }
        else
        {

            list = path.list(new DirFilter(args[0]));

            Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
            for (String dirItem : list)
            {
                System.out.println(dirItem);
            }

        }


    }



}
