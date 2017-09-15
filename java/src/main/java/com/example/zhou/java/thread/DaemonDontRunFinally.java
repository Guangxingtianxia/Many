package com.example.zhou.java.thread;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/1  20:55
 * @Desc :
 */

public class DaemonDontRunFinally
{
    public static void main(String[] args)
    {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
//        System.out.println(" thread is start ");

    }
}
