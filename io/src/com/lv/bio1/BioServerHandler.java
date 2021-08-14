package com.lv.bio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/4/5.
 */
public class BioServerHandler implements Runnable{

    private Socket socket;

    public BioServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader in = null;

        try{
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String body = null;

            while(true){
                body = in.readLine();
                if(null == body){
                    break;
                }
                System.out.println("获取客户端消息" + body);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(null != in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
