package com.lyh.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by lvyanghui
 * 2021/8/15 15:31
 */
public class HttpClient {

    private void sendHttpRequest()throws IOException{
        URL url = new URL("http://localhost:8080");
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setRequestMethod(HttpMethod.METHOD_GET);
        urlConnection.setConnectTimeout(10);
        urlConnection.connect();

        InputStream inputStream = urlConnection.getInputStream();
        int responseCode = urlConnection.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            ByteArrayOutputStream bout2 = new ByteArrayOutputStream();
            int len;
            byte[] bytes = new byte[1024 * 8];
            while ((len = inputStream.read(bytes)) != -1){
                bout2.write(bytes,0,len);
            }
            String result2 = new String(bout2.toByteArray());
            System.out.println(result2);
        }
        urlConnection.disconnect();
    }

    public static void main(String[] args) throws Exception{
        HttpClient httpClient = new HttpClient();
        httpClient.sendHttpRequest();
    }
}
