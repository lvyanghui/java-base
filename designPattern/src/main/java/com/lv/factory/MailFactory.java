package com.lv.factory;

/**
 * Created by lvyanghui on 2018/4/30.
 */
public class MailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
