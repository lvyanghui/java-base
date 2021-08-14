package com.lv.time1;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lvyanghui on 2018/4/5.
 */
public class TimeServerHandlerPool {

    private Executor executor;
    public TimeServerHandlerPool(int maxPool,int queueSize) {
        executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),maxPool,120l, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(queueSize));
    }

    public void execute(Runnable task){
        executor.execute(task);
    }
}
