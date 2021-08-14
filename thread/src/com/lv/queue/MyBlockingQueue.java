package com.lv.queue;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lvyanghui on 2018/6/12.
 */
public class MyBlockingQueue<T> {


    private List<T> queue = new LinkedList<T>();
    private final int limit;

    public MyBlockingQueue(int limit){
        this.limit = limit;
    }

    public void enqueue(T t)throws InterruptedException{
        synchronized (queue){
            while(queue.size() == limit){
                queue.wait();
            }
            if(queue.size() == 0){
                queue.notifyAll();
            }
            queue.add(t);

        }
    }

    public T dequeue()throws InterruptedException{
        synchronized (queue){
            while(queue.size() == 0){
                queue.wait();
            }
            if(queue.size() == limit){
                queue.notifyAll();
            }

            return queue.remove(0);
        }
    }
}
