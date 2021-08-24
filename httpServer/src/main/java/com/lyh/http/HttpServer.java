package com.lyh.http;

import java.io.IOException;

/**
 * Created by lvyanghui
 * 2021/8/24 21:43
 */
public interface HttpServer {

    public void startServer(int port)throws IOException,InterruptedException;
}
