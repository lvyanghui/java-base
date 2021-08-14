package com.lv.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lvyanghui on 2018/6/14.
 */
public class AtomicTest {

    static AtomicInteger integer = new AtomicInteger(0);

    static CountDownLatch countDownLatch = new CountDownLatch(100);

    static AtomicBoolean aBoolean = new AtomicBoolean();
    public static void main(String[] args) throws InterruptedException {

        /*for (int i = 0; i < 100; i++) {
            new Thread(){
                @Override
                public void run() {
                    integer.incrementAndGet();
                    countDownLatch.countDown();
                }
            }.start();

        }
        countDownLatch.await();
        System.out.println(integer.get());*/
    }
}
