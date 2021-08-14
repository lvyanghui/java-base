package com.lv.lock;

/**
 * Created by lvyanghui on 2018/6/24.
 */
public class Goods {

    private String id;
    private int totalNum;
    private int depNum;

    public Goods(String id, int totalNum, int depNum) {
        this.id = id;
        this.totalNum = totalNum;
        this.depNum = depNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getDepNum() {
        return depNum;
    }

    public void setDepNum(int depNum) {
        this.depNum = depNum;
    }
}
