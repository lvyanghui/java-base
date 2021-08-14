package com.lv.senior;

import com.lv.base.SleepUtil;

/**
 * Created by lvyanghui on 2018/6/13.
 */
public class WaitNotifyTest {

    public static void main(String[] args){

        User user = new User(User.CITY,25);
        for (int i = 0; i < 3; i++) {
           Thread thread = new Thread(){
               @Override
               public void run() {
                   try {
                       user.waitCity();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           };
            thread.start();

        }

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(){
                @Override
                public void run() {
                    try {
                        user.waitAge();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }
        SleepUtil.second(2);
        user.changeAge();
    }
}
