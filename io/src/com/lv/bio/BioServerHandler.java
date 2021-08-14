package com.lv.bio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class BioServerHandler implements Runnable{

    private Socket socket;

    public BioServerHandler(Socket socket){
        this.socket = socket;
    }
    public void run(){

        BufferedReader in = null;
        try{
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            String body = null;
            while (true){
                body = in.readLine();
                if(null == body){
                    break;
                }
                System.out.print("服务器接受到指令"+ body);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null != in){
                try{
                    in.close();
                    in = null;
                }catch (Exception e){

                }

            }

            if(null != socket){
                try{
                    socket.close();
                }catch (Exception e){

                }
                this.socket = null;
            }
        }

    }
}
