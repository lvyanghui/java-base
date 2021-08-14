package com.lv.senior;

/**
 * Created by lvyanghui on 2018/6/11.
 */
public class VolatileTest {

    public static void main(String[] args){
        VolatileThread volatileThread = new VolatileThread();

        Thread thread1 = new Thread(volatileThread);
        Thread thread2 = new Thread(volatileThread);
        Thread thread3 = new Thread(volatileThread);
        Thread thread4 = new Thread(volatileThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
