package com.lv.queue;

import com.lv.base.SleepUtil;

import java.util.concurrent.BlockingQueue;

/**
 * Created by lvyanghui on 2018/6/12.
 */
public class QueueTest {

    //static MyBlockingQueue myBlockingQueue = new MyBlockingQueue(10);

    static BlockingQueueLock blockingQueueLock = new BlockingQueueLock(10);
    static class EnThread extends Thread{
        @Override
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    System.out.println("myBlockingQueue enqueue" + i);
                    blockingQueueLock.enqueue(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class DeThread extends Thread{
        @Override
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    System.out.println("myBlockingQueue dequeue " + blockingQueueLock.dequeue());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        /*EnThread enThread = new EnThread();

        DeThread deThread = new DeThread();

        enThread.start();

        SleepUtil.second(2);
        deThread.start();*/

        System.out.println(Math.round(11.5));
    }
}
