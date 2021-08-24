package com.lyh.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by lvyanghui
 * 2021/8/15 15:09
 */
public class NioServer implements HttpServer{



    public void startServer(int port)throws IOException,InterruptedException{
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(port));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true){
            int result = selector.select();
            if (result <= 0) {
                continue;
            }
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                iterator.remove();
                if(selectionKey.isValid()){
                    if (selectionKey.isAcceptable()){
                        ServerSocketChannel channel = (ServerSocketChannel)selectionKey.channel();
                        SocketChannel socketChannel = channel.accept();
                        socketChannel.configureBlocking(false);
                        socketChannel.register(selector,SelectionKey.OP_READ);
                    }
                    if(selectionKey.isReadable()){
                        SocketChannel channel = (SocketChannel)selectionKey.channel();
                        channel.configureBlocking(false);
                        Socket socket = channel.socket();
                        HttpHandler handler = new HttpHandler();
                        handler.parseHttp(socket);
                    }
                }
            }
        }
    }

}
