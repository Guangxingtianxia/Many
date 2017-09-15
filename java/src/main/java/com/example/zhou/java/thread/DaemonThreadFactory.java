package com.example.zhou.java.thread;

import android.support.annotation.NonNull;

import java.util.concurrent.ThreadFactory;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/1  19:49
 * @Desc : 通过编写定制的ThreadFactory可以定制线程的属性（后台，优先级，名称）
 */

public class DaemonThreadFactory implements ThreadFactory
{
    @Override
    public Thread newThread(@NonNull Runnable r)
    {
        Thread t = new Thread();

        t.setDaemon(true);
        return t;
    }
}
