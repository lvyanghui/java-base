package com.lv.bio;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class BioServer {

    public static void main(String[] args)throws Exception{
        int port = 8080;
        ServerSocket server = null;
        Socket socket = null;
        try{
            server = new ServerSocket(port);
            System.out.println("bio服务器启动,监听端口:" + port);

            while(true){
                socket = server.accept();
                new Thread(new BioServerHandler(socket)).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null != server){
                server.close();
                server = null;
            }
        }

    }
}
