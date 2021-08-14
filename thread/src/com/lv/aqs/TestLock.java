package com.lv.aqs;

import com.lv.base.SleepUtil;

/**
 * Created by lvyanghui on 2018/6/24.
 */
public class TestLock {

    public static void main(String[] args){
        TestLock testLock = new TestLock();
        testLock.test();
    }


    public void test(){

        //SingleLock lock = new SingleLock();
        TwoLock lock = new TwoLock();
        class Worker extends Thread{
            @Override
            public void run() {
                lock.lock();
                System.out.println(Thread.currentThread().getId() + "被锁");
                try{
                    SleepUtil.second(2);
                }finally {
                    System.out.println(Thread.currentThread().getId() + "释放锁");
                    lock.unlock();
                }
                System.out.println();
            }
        }

        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker();
            worker.start();
        }
    }
}
