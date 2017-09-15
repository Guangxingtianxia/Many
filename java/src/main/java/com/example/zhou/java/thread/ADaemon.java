package com.example.zhou.java.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/1  20:47
 * @Desc : 后台进程在不执行finall 子句的情况下，会终止run()
 */

public class ADaemon implements Runnable
{
    @Override
    public void run()
    {

        try
        {
            System.out.println("ADaemon is starting");
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e)
        {
            System.out.println(" InterruptedException ");
            e.printStackTrace();
        }
        finally
        {
            System.out.println(" This should always run ? ");
        }


    }


}
