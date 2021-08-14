package com.lv.factory;

/**
 * Created by lvyanghui on 2018/4/30.
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("This is SmsSender");
    }
}
