package com.lv.interrupt;

import com.lv.base.SleepUtil;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class BlockInterrupt {

    public static class TryWhileWhenBlock extends Thread{

        private volatile boolean on = true;
        @Override
        public void run() {
            System.out.println("TryWhileWhenBlock开启线程");
            while (on && !interrupted()){
                try {
                    synchronized (this){
                        wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("TryWhileWhenBlock关闭线程");
                    interrupt();
                }
            }
        }

        public void cancel(){
            on = false;
            System.out.println("开始关闭线程" + on);
            interrupt();
            System.out.println("结束关闭线程" + on);
        }
    }

    public static class WhileTryWhenBlock extends Thread{

        private volatile boolean on = true;
        @Override
        public void run() {
            try {
                System.out.println("WhileTryWhenBlock开启线程");
                while (on && !interrupted()){
                    synchronized (this){
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("WhileTryWhenBlock关闭线程");
            }
        }

        public void cancel(){
            on = false;
            System.out.println("开始关闭线程" + on);
            interrupt();
            System.out.println("结束关闭线程" + on);
        }
    }

    public static void main(String[] args){
        /*TryWhileWhenBlock tryWhileWhenBlock = new TryWhileWhenBlock();
        tryWhileWhenBlock.start();
        SleepUtil.second(1);
        tryWhileWhenBlock.cancel();*/

        WhileTryWhenBlock whileTryWhenBlock = new WhileTryWhenBlock();
        whileTryWhenBlock.start();
        SleepUtil.second(1);
        whileTryWhenBlock.cancel();
    }
}
