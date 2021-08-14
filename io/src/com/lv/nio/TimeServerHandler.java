package com.lv.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by lvyanghui on 2018/4/6.
 */
public class TimeServerHandler implements Runnable{

    private Selector selector;

    private ServerSocketChannel serverChannel;

    private volatile boolean stop;

    public TimeServerHandler(int port){
        try {
            serverChannel = ServerSocketChannel.open();
            serverChannel.configureBlocking(false);

            serverChannel.socket().bind(new InetSocketAddress(port),1024);

            selector = Selector.open();
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("The time server is start in port "+ port);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void stop(){
        this.stop = true;
    }
    @Override
    public void run() {

        while (!stop){
            try {
                selector.select();
                Set<SelectionKey> selectionKeys =  selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();

                SelectionKey selectionKey = null;

                while(iterator.hasNext()){
                    selectionKey = iterator.next();
                    iterator.remove();

                    try{
                        handleInput(selectionKey);
                    }catch (IOException e){
                        if(null != selectionKey){
                            selectionKey.cancel();
                        }
                        if(null != selectionKey.channel()){
                            selectionKey.channel().close();
                        }
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(null != selector){
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInput(SelectionKey selectionKey)throws IOException{
        if(selectionKey.isValid()){
            if(selectionKey.isAcceptable()){
                ServerSocketChannel serverChannel = (ServerSocketChannel) selectionKey.channel();
                SocketChannel socketChannel = serverChannel.accept();
                socketChannel.configureBlocking(false);
                socketChannel.register(selector,SelectionKey.OP_READ);
            }
            if(selectionKey.isReadable()){
                SocketChannel socketChannel = (SocketChannel)selectionKey.channel();

                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                int count = socketChannel.read(byteBuffer);

                if(count > 0){
                    byteBuffer.flip();
                    byte[] bytes = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bytes);

                    String msg = new String(bytes,"UTF-8");

                    System.out.println("The time server(Thread" + Thread.currentThread() + ") receive order " + msg);
                    String resp = "QUERY TIME SERVER".equalsIgnoreCase(msg) ? new Date().toString() : "BAD OERDER";

                    doWrite(socketChannel,resp);
                }else if(count < 0){
                    socketChannel.close();
                }

            }
        }
    }

    private void doWrite(SocketChannel socketChannel,String resp)throws IOException{
        if(null != resp && resp.trim().length() > 0){

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            byteBuffer.put(resp.getBytes());

            byteBuffer.flip();
            socketChannel.write(byteBuffer);

            System.out.println("服务器成功发出消息" + resp);
        }else{
            System.out.println("没有消息");
        }
    }
}
