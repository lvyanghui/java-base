package com.lv.nio;

/**
 * Created by lvyanghui on 2018/4/6.
 */
public class TimeServer {

    public static void main(String[] args){
        int port = 8080;

        TimeServerHandler server = new TimeServerHandler(port);
        new Thread(server,"TimeServerHandler-001").start();
    }
}
