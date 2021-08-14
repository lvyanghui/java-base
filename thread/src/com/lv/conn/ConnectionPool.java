package com.lv.conn;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * Created by lvyanghui on 2018/6/14.
 */
public class ConnectionPool {

    private LinkedList<Connection> pool = new LinkedList<Connection>();

    public ConnectionPool(int number) {
        init(number);
    }

    public void init(int number){
        if(number > 0){
            for (int i = 0; i < number; i++) {
                pool.addLast(ConnectionDriver.getConnection());
            }
        }
    }

    public void releaseConnection(Connection conn){
        synchronized(pool){
            if(null != conn){
                pool.addLast(conn);
                pool.notifyAll();
            }
        }
    }

    public Connection fetchConnection(long mills) throws InterruptedException {

        synchronized (pool) {
            if (mills <= 0) {
                while (pool.isEmpty()) {
                    pool.wait();
                }
                return pool.removeFirst();
            } else {
                long future = System.currentTimeMillis() + mills;
                long reming = mills;
                while (pool.isEmpty() && reming > 0) {
                    pool.wait(reming);
                    reming = future - System.currentTimeMillis();
                }
                Connection result = null;
                if (!pool.isEmpty()) {
                    result = pool.removeFirst();
                }
                return result;
            }
        }

    }
}
