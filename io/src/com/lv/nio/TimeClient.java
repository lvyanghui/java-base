package com.lv.nio;

/**
 * Created by lvyanghui on 2018/4/6.
 */
public class TimeClient {

    public static void main(String[] args)throws Exception{
        int port = 8080;
        TimeClientHandler clientHandler = new TimeClientHandler("127.0.0.1",port);

        new Thread(clientHandler,"clientHandler-001").start();

    }
}
