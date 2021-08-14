package com.lv.senior;

/**
 * Created by lvyanghui on 2018/6/11.
 */
public class ThreadLocalTest {

    static ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "init";
        }
    };

    static class LocalTest implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getId() + " is start " + threadLocal.get());
            String val = threadLocal.get() + "_" + Thread.currentThread().getId();
            threadLocal.set(val);
            System.out.println(Thread.currentThread().getId() + " is finish " + threadLocal.get());
        }
    }
    public static void main(String[] args){

        LocalTest localTest = new LocalTest();
        for (int i = 0; i < 3; i++) {
            new Thread(localTest).start();
        }
    }
}
