package com.lv.conn;

import java.sql.Connection;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lvyanghui on 2018/6/19.
 */
public class ConnectionTest {
    static ConnectionPool pool = new ConnectionPool(10);

    static CountDownLatch start = new CountDownLatch(1);

    static CountDownLatch end;

    static class ConnThread implements Runnable{

        private AtomicInteger got;
        private AtomicInteger notGot;
        private int count;

        public ConnThread(AtomicInteger got, AtomicInteger notGot, int count) {
            this.got = got;
            this.notGot = notGot;
            this.count = count;
        }

        @Override
        public void run() {

            try {
                start.await();
            } catch (Exception e) {
            }
            while (count > 0){
                try {
                    Connection conn = pool.fetchConnection(1000);
                    if(null == conn){
                        notGot.incrementAndGet();
                    }else{
                        try{
                            conn.createStatement();
                            conn.commit();
                        }finally {
                            pool.releaseConnection(conn);
                            got.incrementAndGet();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }  finally {
                    count--;
                }
            }
            end.countDown();
        }
    }

    public static void main(String[] args){

        AtomicInteger got = new AtomicInteger(0);
        AtomicInteger notGot = new AtomicInteger(0);
        AtomicInteger total = new AtomicInteger(0);

        int threadCount = 50;
        int count = 20;

        end = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new ConnThread(got,notGot,count));
            thread.start();
        }

        start.countDown();

        try {
            end.await();

            System.out.println("got number " + got.get());
            System.out.println("notGot number " + notGot.get());
            System.out.println("total number " + total.get());

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR,10);
            System.out.println(calendar.getTimeInMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
