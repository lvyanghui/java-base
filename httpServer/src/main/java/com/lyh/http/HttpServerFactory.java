package com.lyh.http;

/**
 * Created by lvyanghui
 * 2021/8/24 21:35
 */
public class HttpServerFactory {

    public static HttpServer getBioServer(){
        return new BioServer();
    }

    public static HttpServer getNioServer(){
        return new NioServer();
    }

    public static void main(String[] args) throws Exception{
        /*HttpServer bioServer = HttpServerFactory.getBioServer();
        bioServer.startServer(8080);*/

        HttpServer nioServer = HttpServerFactory.getNioServer();
        nioServer.startServer(8080);
    }
}
