package com.lv.base;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class JoinTest {

    public static class JoinThread extends Thread{
        private Thread thread;

        public JoinThread(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + "进行工作");
        }

        public static void main(String[] args){
            Thread thread = Thread.currentThread();
            for (int i = 0; i < 10; i++) {
                JoinThread joinThread = new JoinThread(thread);
                joinThread.setName("joinThread-" + i);
                joinThread.start();
                System.out.println(thread.getName() + "进行join插队");
                thread = joinThread;
            }
        }
    }
}
