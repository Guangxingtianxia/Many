package com.example.zhou.java.thread;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/1  2:31
 * @Desc :
 */

public class DaemonThreadPoolExecutor extends ThreadPoolExecutor

{
    public DaemonThreadPoolExecutor()
    {
        super(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(),
                new DaemonThreadFactory());

    }
}
