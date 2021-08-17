package com.lyh.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lvyanghui
 * 2021/8/15 15:16
 */
public class HttpHandler {

    public void parseHttp(InputStream in)throws IOException{

        /*ByteArrayOutputStream bout1 = new ByteArrayOutputStream();
        int i;
        while ((i = in.read()) != -1){
            bout1.write(i);
        }
        String result1 = new String(bout1.toByteArray());
        System.out.println(result1);*/


        ByteArrayOutputStream bout2 = new ByteArrayOutputStream();
        int len;
        byte[] bytes = new byte[2];
        while ((len = in.read(bytes)) != -1){
            bout2.write(bytes,0,len);
        }

        String result2 = new String(bout2.toByteArray());
        System.out.println(result2);

        in.close();
        bout2.close();
    }
}
