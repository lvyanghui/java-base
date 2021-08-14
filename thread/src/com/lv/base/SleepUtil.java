package com.lv.base;

import java.util.concurrent.TimeUnit;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class SleepUtil {

    public static final void second(long second){
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
