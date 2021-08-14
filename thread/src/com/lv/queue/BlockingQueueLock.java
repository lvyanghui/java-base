package com.lv.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lvyanghui on 2018/6/12.
 */
public class BlockingQueueLock<T> {


    private List<T> queue = new LinkedList<T>();
    private final int limit;
    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();


    public BlockingQueueLock(int limit){
        this.limit = limit;
    }

    public void enqueue(T t)throws InterruptedException{
        lock.lock();
        try{
            while(queue.size() == limit){
                notFull.await();
            }
            if(queue.size() == 0){
                notEmpty.signal();
            }
            queue.add(t);

        }finally {
            lock.unlock();
        }
    }

    public T dequeue()throws InterruptedException{
        lock.lock();
        try{
            while(queue.size() == 0){
                notEmpty.wait();
            }
            if(queue.size() == limit){
                notFull.signal();
            }

            return queue.remove(0);
        }finally {
            lock.unlock();
        }
    }
}
