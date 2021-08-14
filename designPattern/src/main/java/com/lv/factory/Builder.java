package com.lv.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvyanghui on 2018/5/1.
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public List<Sender> produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }

        return list;
    }


    public List<Sender> produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }

        return list;
    }
}
