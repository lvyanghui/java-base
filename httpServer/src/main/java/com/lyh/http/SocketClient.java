package com.lyh.http;

import java.io.ByteArrayOutputStream;
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

        String httpRequest = "hello, world" + i;
        socket.getOutputStream().write(httpRequest.getBytes());

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        int len;
        byte[] bytes = new byte[1024 * 8];
        while ((len = socket.getInputStream().read(bytes)) != -1){
            bout.write(bytes,0,len);
        }

        String result2 = new String(bout.toByteArray());
        System.out.println(result2);
        socket.close();
    }

    public static void main(String[] args) throws Exception{
        SocketClient socketClient = new SocketClient();
        /*for (int i = 0; i < 100000; i++) {
            socketClient.sendHttpRequest(8080,i);
        }*/
        socketClient.sendHttpRequest(8080,1);
    }
}
