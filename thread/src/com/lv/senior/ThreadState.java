package com.lv.senior;

import com.lv.base.SleepUtil;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lvyanghui on 2018/6/12.
 */
public class ThreadState {

    private static Lock lock = new ReentrantLock();
    public static void main(String[] args){

        new Thread(new AlwaysSleep(),"AlwaysSleepThread").start();
        new Thread(new Waiting(),"WaitingThread").start();
        new Thread(new Blocking(),"Blocking-1").start();
        new Thread(new Blocking(),"Blocking-2").start();
        new Thread(new Locking(),"Locking-1").start();
        new Thread(new Locking(),"Locking-2").start();
    }

    static class AlwaysSleep implements Runnable{
        @Override
        public void run() {
            while (true){
                SleepUtil.second(2);
            }
        }
    }

    static class Waiting implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (Waiting.class){
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocking implements Runnable{
        @Override
        public void run() {
            synchronized (Blocking.class){
                SleepUtil.second(2);
            }
        }
    }

    static class Locking implements Runnable{
        @Override
        public void run() {
            lock.lock();
            try{
                SleepUtil.second(2);
            }finally {
                lock.unlock();
            }
        }
    }
}
