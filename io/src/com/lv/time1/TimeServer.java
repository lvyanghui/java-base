package com.lv.time1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/4/5.
 */
public class TimeServer {

    public static void main(String[] args){
        int port = 8080;

        ServerSocket server = null;

        try {
            server = new ServerSocket(port);
            System.out.println("TimeServer start in port " + port);
            Socket socket = null;

            while (true){
                socket = server.accept();
                System.out.println("TimeServer and TimeClient enstable connection by threee  in port " + port);

                TimeServerHandlerPool pool = new TimeServerHandlerPool(100,200);
                pool.execute(new TimeServerHandler(socket));
                //new Thread(new TimeServerHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

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
