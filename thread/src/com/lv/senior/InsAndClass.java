package com.lv.senior;

import com.lv.base.SleepUtil;

/**
 * Created by lvyanghui on 2018/6/12.
 */
public class InsAndClass {

    static class SynClass extends Thread{
        @Override
        public void run() {
            System.out.println("SynClass is start ..........." );
            SynMtd();
            System.out.println("SynClass is end ..........." );
        }

        public static void SynMtd(){
            SleepUtil.second(1);
            System.out.println("SynClass take method SynMtd ..........." );
            SleepUtil.second(1);
        }
    }

    static class InsClass1 extends Thread{

        private InsAndClass insAndClass;
        public InsClass1(InsAndClass insAndClass){
            this.insAndClass = insAndClass;
        }
        @Override
        public void run() {
            synchronized (insAndClass){
                System.out.println("InsClass1 is start ..........." );
                InsMtd();
                System.out.println("InsClass1 is end ..........." );
            }
        }

        public static void InsMtd(){
            SleepUtil.second(1);
            System.out.println("InsClass1 take method InsMtd ..........." );
            SleepUtil.second(1);
        }
    }

    static class InsClass2 extends Thread{
        private InsAndClass insAndClass;
        public InsClass2(InsAndClass insAndClass){
            this.insAndClass = insAndClass;
        }

        @Override
        public void run() {
            synchronized (insAndClass){
                System.out.println("InsClass2 is start ..........." );
                InsMtd();
                System.out.println("InsClass2 is end ..........." );
            }
        }

        public static void InsMtd(){
            SleepUtil.second(1);
            System.out.println("InsClass2 take method InsMtd ..........." );
            SleepUtil.second(1);
        }
    }

    public static void main(String[] args){
        InsAndClass insAndClass = new InsAndClass();
        SynClass synClass = new SynClass();
        InsClass1 insClass1 = new InsClass1(insAndClass);
        InsClass2 insClass2 = new InsClass2(insAndClass);

        insClass1.start();
        insClass2.start();
        synClass.start();

    }
}
