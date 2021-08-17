package com.lyh.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by lvyanghui
 * 2021/8/15 15:31
 */
public class SocketClient {

    private void sendHttpRequest(int port, int i)throws IOException{
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("127.0.0.1",port));

        String httpRequest = "hello，服务器" + i;
        socket.getOutputStream().write(httpRequest.getBytes());
        socket.close();
    }

    public static void main(String[] args) throws Exception{
        SocketClient socketClient = new SocketClient();
        for (int i = 0; i < 100000; i++) {
            socketClient.sendHttpRequest(8080,i);
        }
    }
}
