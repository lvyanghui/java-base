package com.lv.time;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class TimeClient {

    public static void main(String[] args){
        int port = 8080;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            socket = new Socket("127.0.0.1", port);
            System.out.println("客户端握手服务器端口号" + port);
            out = new PrintWriter(socket.getOutputStream(),true);
            out.println("发送个消息看看");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String body = in.readLine();
            System.out.println("服务器回应了" + body);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(out != null){
                out.close();
                out = null;
            }

            if(in != null){
                try{
                    in.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            in = null;

            if(socket != null){
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
