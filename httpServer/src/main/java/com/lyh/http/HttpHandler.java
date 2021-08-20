package com.lyh.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by lvyanghui
 * 2021/8/15 15:16
 */
public class HttpHandler {

    protected static final String splitFlag = "\r\n\r\n";

    public void parseHttp(Socket socket)throws IOException{

        /*
        InputStream in = socket.getInputStream();
        ByteArrayOutputStream bout1 = new ByteArrayOutputStream();
        int i;
        while ((i = in.read()) != -1){
            bout1.write(i);
        }
        String result1 = new String(bout1.toByteArray());

        InputStream in = socket.getInputStream();
        ByteArrayOutputStream bout2 = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024 * 8];
        int len;
        while ((len = in.read(bytes)) != -1){
            bout2.write(bytes,0,len);
        }
        String result2 = new String(bout2.toByteArray());
        System.out.println(result2);*/

        InputStream in = socket.getInputStream();
        ByteArrayOutputStream bout2 = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024 * 8];
        int len = in.read(bytes);
        bout2.write(bytes,0,len);

        byte[] data = bout2.toByteArray();
        boolean isReadEnd = data.length < 1024 * 8;
        String headerContext = new String(data, "iso-8859-1");
        String bodyContext = null;
        if (headerContext.contains(splitFlag)) {
            bodyContext = headerContext.substring(headerContext.indexOf(splitFlag) + splitFlag.length());
            headerContext = headerContext.substring(0, headerContext.indexOf(splitFlag));
        }

        System.out.println("headerContext" + headerContext);
        System.out.println("bodyContext" + bodyContext);

        buildResponse(socket,"接收到请求!".getBytes());

        in.close();
        bout2.close();
        socket.close();
    }

    public void buildResponse(Socket socket, byte[] data) throws IOException {

        Integer contextLength = 0;
        if (data != null) {
            contextLength = data.length;
        }
        //response.setHeader("Content-Length", contextLength.toString());
        StringBuilder responseHeader = new StringBuilder("HTTP/1.1 ").append(200).append(" ").append("\r\n");
        responseHeader.append("\r\n");

        socket.getOutputStream().write(responseHeader.toString().getBytes("UTF-8"));
        socket.getOutputStream().write(data);
    }

}
