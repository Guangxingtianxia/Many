package com.example.zhou.java.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/9  16:37
 * @Desc : 从流中获取通道
 */

public class GetChannel
{
    public static final int BSIZE = 1024;

    public static void main(String[] args)
    {
        try
        {
            FileChannel fc = new FileOutputStream("D:/test/demo2.txt").getChannel();
            fc.write(ByteBuffer.wrap("Some text ".getBytes()));
            fc.close();

            // add to the end of the file
            fc = new RandomAccessFile("D:/test/demo2.txt", "rw").getChannel();
            fc.position(fc.size());
            fc.write(ByteBuffer.wrap("Some more".getBytes()));
            fc.close();

            // read the file
            fc = new FileInputStream("D:/test/demo2.txt").getChannel();
            ByteBuffer buff = ByteBuffer.allocate(BSIZE);
            fc.read(buff);
            buff.flip();
            while (buff.hasRemaining())
            {
                System.out.println((char) buff.get());
            }

        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
