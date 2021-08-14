package com.lv.time;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class TimeServerHandlerPool {

    private ExecutorService executor;

    public TimeServerHandlerPool(int maxPoolSize, int queueSize){
        executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), maxPoolSize, 120l, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(queueSize));
    }

    public void execute(Runnable task){
        executor.execute(task);
    }
}
