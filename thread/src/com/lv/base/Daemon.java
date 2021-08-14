package com.lv.base;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class Daemon {
    public static void main(String[] args){
        DaemonTest daemonTest = new DaemonTest();
        daemonTest.setDaemon(true);
        daemonTest.start();
    }

    public static class DaemonTest extends Thread{
        @Override
        public void run() {
            try{
                SleepUtil.second(10);
            }finally {
                System.out.println("DaemonTest测试");
            }

        }
    }
}
