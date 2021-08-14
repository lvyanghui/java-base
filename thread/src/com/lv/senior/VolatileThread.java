package com.lv.senior;

/**
 * Created by lvyanghui on 2018/6/11.
 */
public class VolatileThread implements Runnable{

    private volatile int a = 0;

    @Override
    public void run() {
        a++;
        System.out.println("thread start " + a);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a++;
        System.out.println("thread finish " + a);
    }
}
