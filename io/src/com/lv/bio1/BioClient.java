package com.lv.bio1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/4/5.
 */
public class BioClient {
    public static void main(String[] args){
        int port = 8080;

        Socket socket = null;

        PrintWriter out = null;
        try {
            socket = new Socket("127.0.0.1",port);
            System.out.println("客户端启动端口" + port);
            out = new PrintWriter(socket.getOutputStream(),true);

            out.print("你好,服务器");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
