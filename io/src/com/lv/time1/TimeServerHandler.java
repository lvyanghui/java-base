package com.lv.time1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * Created by lvyanghui on 2018/4/5.
 */
public class TimeServerHandler implements Runnable{


    private Socket socket;

    public TimeServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String body = null;
            while (true){
                body = in.readLine();
                if(null == body){
                    break;
                }

                System.out.println("TimeServer " + Thread.currentThread() + " receive order" + body);
                out = new PrintWriter(socket.getOutputStream(),true);
                String time = body.equalsIgnoreCase("QUERY TIME SERVER") ? new Date().toString() : "BAD ORDER";
                out.println(time);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null != out){
                out.close();
            }

            if(null != socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
