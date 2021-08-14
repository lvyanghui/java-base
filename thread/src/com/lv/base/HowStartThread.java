package com.lv.base;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class HowStartThread {

    public static class ThreadTest extends Thread{
        @Override
        public void run() {
            System.out.println("通过Thread开启线程");
        }
    }


    public static class RunableTest implements Runnable{
        @Override
        public void run() {
            System.out.println("通过Runnable开启线程");
        }
    }

    public static void main(String[] args){
        ThreadTest threadTest = new ThreadTest();
        Thread runableTest = new Thread(new RunableTest());

        threadTest.start();
        runableTest.start();
    }
}
