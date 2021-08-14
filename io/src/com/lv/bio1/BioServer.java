package com.lv.bio1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/4/5.
 */
public class BioServer {

    public static void main(String[] args){
        int port = 8080;

        ServerSocket server = null;

        try{
            server = new ServerSocket(port);
            System.out.println("服务器启动端口" + port);

            Socket socket = null;

            while(true){
                socket = server.accept();
                System.out.println("服务器和客户端三次握手建立连接");

                new Thread(new BioServerHandler(socket)).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(null != server){
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
