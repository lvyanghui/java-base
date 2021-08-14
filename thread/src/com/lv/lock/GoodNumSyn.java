package com.lv.lock;

/**
 * Created by lvyanghui on 2018/6/24.
 */
public class GoodNumSyn implements GoodNum{

    private Goods goods;

    public GoodNumSyn(Goods goods) {
        this.goods = goods;
    }

    @Override
    public synchronized int getGoodNum() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return goods.getTotalNum();
    }

    @Override
    public synchronized void setGoodNum(int cgeNum) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goods.setDepNum(goods.getDepNum() + cgeNum);
        goods.setTotalNum(goods.getTotalNum() + cgeNum);
    }
}
