package com.example.zhou.java.overloaded;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/10  15:39
 * @Desc : eggective java 41: 慎用重载
 */

public class OverLoad1
{

    public static void main(String[] args)
    {
        Collection<?> [] collections = {new HashSet<String>(),new ArrayList<BigInteger>(),
                new HashMap<String,String>().values()};

        for (Collection<?> c : collections)
        {
            System.out.println(classify(c));
        }


    }

    public  static String classify(List<?> s)
    {
        return "List";

    }

    public  static String classify(Set<?> s)
    {
        return "set";

    }

    public  static String classify(Collection<?> s)
    {
        return "unknown Collection";

    }


}
