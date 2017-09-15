package com.example.zhou.java.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/9  14:50
 * @Desc :
 */

public class FileWriterDemo
{
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args)
    {

        System.out.println("创建开始====");
        creatNewFile();
        System.out.println("创建结束====");


    }

    private static void creatNewFile()
    {
        File dir = new File("D:/test");
        if (!dir.exists())
        {
            dir.mkdir();
        }
        try
        {
            File text = new File("D:/test/demo2.txt");
            if (!text.exists())
            {
                text.createNewFile();
            }

            FileWriter fw = new FileWriter("D:/test/demo2.txt", false);
            fw.write("hahhahaah");
            fw.flush();
            fw.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }


}
