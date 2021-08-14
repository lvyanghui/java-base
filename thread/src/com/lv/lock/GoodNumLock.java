package com.lv.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by lvyanghui on 2018/6/24.
 */
public class GoodNumLock implements GoodNum{

    private Goods goods;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock wLock = lock.writeLock();
    private Lock rLock = lock.readLock();

    public GoodNumLock(Goods goods) {
        this.goods = goods;
    }

    @Override
    public int getGoodNum() {
        rLock.lock();
        try{
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return goods.getTotalNum();
        }finally {
            rLock.unlock();
        }
    }

    @Override
    public void setGoodNum(int cgeNum) {
        wLock.lock();
        try{
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            goods.setDepNum(goods.getDepNum() + cgeNum);
            goods.setTotalNum(goods.getTotalNum() + cgeNum);
        }finally {
            wLock.unlock();
        }

    }
}
