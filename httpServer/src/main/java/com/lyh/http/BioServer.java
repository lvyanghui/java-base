package com.lyh.http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lvyanghui
 * 2021/8/15 15:09
 */
public class BioServer implements HttpServer{

    public void startServer(int port)throws IOException{

        try(ServerSocket server = new ServerSocket(port)){
            while (true){
                Socket socket = server.accept();
                HttpHandler handler = new HttpHandler();
                handler.parseHttp(socket);
            }
        }
    }
}
