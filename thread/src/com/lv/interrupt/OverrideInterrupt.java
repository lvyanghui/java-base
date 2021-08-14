package com.lv.interrupt;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/6/4.
 */
public class OverrideInterrupt extends Thread{

    private Socket socket = null;
    private InputStream in = null;
    @Override
    public void run() {
        System.out.println("通过Thread开启线程");
    }

    @Override
    public void interrupt() {
        try {
            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            super.interrupt();
        }
    }
}
