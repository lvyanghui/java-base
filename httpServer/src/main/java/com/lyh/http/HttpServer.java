package com.lyh.http;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lvyanghui
 * 2021/8/15 15:09
 */
public class HttpServer {

    private void startServer(int port)throws IOException{

        try(ServerSocket server = new ServerSocket(port)){
            while (true){
                Socket socket = server.accept();
                HttpHandler handler = new HttpHandler();
                handler.parseHttp(socket.getInputStream());
            }
        }
    }

    public static void main(String[] args) throws Exception{
        HttpServer httpServer = new HttpServer();
        httpServer.startServer(8080);
    }
}
