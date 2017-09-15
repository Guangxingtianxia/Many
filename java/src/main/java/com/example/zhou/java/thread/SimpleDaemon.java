package com.example.zhou.java.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/1  19:29
 * @Desc :
 */

public class SimpleDaemon implements Runnable
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            Thread daemon = new Thread(new SimpleDaemon());
            daemon.setDaemon(true);
            daemon.start();

        }

        System.out.println(" all daemon start ");
        try
        {
            System.out.println(  Thread.currentThread().getName()+ " main 线程睡了");
            TimeUnit.MICROSECONDS.sleep(175);
            System.out.println(" main 线程不睡了");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                TimeUnit.MICROSECONDS.sleep(100);

                System.out.println(Thread.currentThread().getName() + "--->" + this);


            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                System.out.println("seep() in interrcupt");

            }


        }


    }


}
