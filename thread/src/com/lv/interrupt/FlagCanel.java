package com.lv.interrupt;

import com.lv.base.SleepUtil;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class FlagCanel {

    public static class ThreadTest extends Thread{

        private volatile boolean on = true;
        @Override
        public void run() {

            while (on){
                System.out.println("通过Thread开启线程");

                synchronized (this){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void cancel(){
            on = false;
            System.out.println("关闭线程" + on);
        }
    }

    public static void main(String[] args){
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();

        SleepUtil.second(2);
        threadTest.cancel();
    }
}
