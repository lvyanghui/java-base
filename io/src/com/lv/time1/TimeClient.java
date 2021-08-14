package com.lv.time1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/4/5.
 */
public class TimeClient {

    public static void main(String[] args){

        int port = 8080;

        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            socket = new Socket("127.0.0.1",port);
            System.out.println("TimeClient start in port " + port);

            out = new PrintWriter(socket.getOutputStream(),true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("QUERY TIME SERVER");

            String resp = in.readLine();
            System.out.println(resp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(null != in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null != out){
                out.close();
            }

            if(null != socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
