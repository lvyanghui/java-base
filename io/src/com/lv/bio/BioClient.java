package com.lv.bio;

import java.io.*;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class BioClient {

    public static void main(String[] args)throws Exception{

        Socket socket = null;
        PrintWriter out = null;
        try{
            socket = new Socket("127.0.0.1",8080);

            out = new PrintWriter(socket.getOutputStream(),true);
            out.println("赶紧做饭了");
            System.out.println("给服务器发送指令");
            socket.shutdownOutput();
            InputStream input = socket.getInputStream();
            byte[] bytes = new byte[1024];
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            int len;
            while ( (len = input.read(bytes)) != -1){
                output.write(bytes,0, len);
            }
            System.out.println("获取结果" +  new String(output.toByteArray()));
        }catch (Exception e){

        }finally{
            if(null != socket){
                socket.close();
                socket = null;
            }

            if(null != out){
                out.close();
                out = null;
            }

        }
    }
}
