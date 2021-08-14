package com.lv.time;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class TimeServer {

    public static void main(String[] args){

        int port = 8080;
        ServerSocket server = null;
        Socket socket = null;
        try{
            server = new ServerSocket(port);
            System.out.println("服务器启动端口" + port);
            TimeServerHandlerPool executor = new TimeServerHandlerPool(50, 10000);
            while(true){
                socket = server.accept();
                //new Thread(new TimeServerHandler(socket)).start();
                executor.execute(new TimeServerHandler(socket));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null != server){
                try{
                    server.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            server = null;
        }
    }
}
