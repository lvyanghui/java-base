package com.lv.time;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class TimeServerHandler implements Runnable{

    private Socket socket;
    public TimeServerHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            String body = null;
            while (true){
                body = in.readLine();
                if(null == body){
                    break;
                }
                System.out.println(Thread.currentThread()+"接受到消息" + body);
                out = new PrintWriter(this.socket.getOutputStream(),true);
                out.println("吃完了");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null != socket){
                try{
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            socket = null;
        }
    }
}
