package com.example.zhou.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/1  19:55
 * @Desc :
 */

public class DaemonFromFactory implements Runnable
{
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+"睡100 毫秒"+ this);
                // 睡100 毫秒
                TimeUnit.MICROSECONDS.sleep(100);

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                System.out.println("interrcupt");
            }
        }


    }


    public static void main(String[] args)
    {
        int a = -1;
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 10; i++)
        {
             a= i ;

            try
            {
                exec.execute(new DaemonFromFactory());
                System.out.println(Thread.currentThread().getName()+"-线程-------睡500");
                TimeUnit.MICROSECONDS.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }

        System.out.println("all daemon starts--->"+a);


    }






}
