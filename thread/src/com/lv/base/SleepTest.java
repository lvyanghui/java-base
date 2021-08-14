package com.lv.base;

/**
 * Created by lvyanghui on 2018/6/11.
 */
public class SleepTest {

    private static Object lock = new Object();
    public static void main(String[] args){
        ThreadSleep threadSleep = new ThreadSleep();

        ThreadNotSleep threadNotSleep = new ThreadNotSleep();

        new Thread(threadSleep).start();

        SleepUtil.second(1);

        new Thread(threadNotSleep).start();
    }

    static class ThreadSleep implements Runnable{
        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + "is started");

            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + "will work");
                SleepUtil.second(5);
                System.out.println(Thread.currentThread().getName() + "finish work");
            }
        }
    }

    static class ThreadNotSleep implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "will work");
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + "take lock" + System.currentTimeMillis());
                System.out.println(Thread.currentThread().getName() + "finish work");
            }
        }
    }
}
