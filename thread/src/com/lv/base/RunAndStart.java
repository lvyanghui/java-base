package com.lv.base;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class RunAndStart {

    public static class ThreadTest extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "通过Thread开启线程");
        }
    }

    public static void main(String[] args){
        ThreadTest threadTest = new ThreadTest();
        threadTest.setName("threadTest");
        threadTest.start();
        //threadTest.run();
    }
}
