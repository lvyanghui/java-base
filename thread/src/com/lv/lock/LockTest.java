package com.lv.lock;

import com.lv.base.SleepUtil;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by lvyanghui on 2018/6/24.
 */
public class LockTest {

    static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args){

        Goods goods = new Goods("Good001",50000,10000);
        GoodNum goodNum = new GoodNumSyn(goods);
        for (int i = 0; i < 30; i++) {
            Thread rThread = new Thread(new ReadThread(goodNum));
            rThread.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread wThread = new Thread(new WriteThread(goodNum));
            wThread.start();
        }
        countDownLatch.countDown();
    }

    static class ReadThread implements Runnable{

        private GoodNum goodNum;

        public ReadThread(GoodNum goodNum) {
            this.goodNum = goodNum;
        }

        @Override
        public void run() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                goodNum.getGoodNum();
            }

            System.out.println("读库存耗时：" + (System.currentTimeMillis() - start) + "ms");
        }
    }

    static class WriteThread implements Runnable{

        private GoodNum goodNum;

        public WriteThread(GoodNum goodNum) {
            this.goodNum = goodNum;
        }

        @Override
        public void run() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goodNum.setGoodNum(new Random().nextInt(10));
            }

            System.out.println("写库存耗时：" + (System.currentTimeMillis() - start) + "ms");
        }
    }
}
