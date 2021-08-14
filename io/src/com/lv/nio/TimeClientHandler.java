package com.lv.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by lvyanghui on 2018/4/6.
 */
public class TimeClientHandler implements Runnable{

    private Selector selector;

    private SocketChannel socketChannel;

    private String host;
    private int port;

    private volatile boolean stop;

    public TimeClientHandler(String host,int port){
        this.host = host;
        this.port = port;
        try {

            socketChannel = SocketChannel.open();

            socketChannel.configureBlocking(false);

            selector = Selector.open();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    @Override
    public void run() {

        try {
            doConnect();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        while (!stop) {
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();

                SelectionKey selectionKey = null;

                while (iterator.hasNext()) {
                    selectionKey = iterator.next();
                    iterator.remove();

                    try {
                        handleInput(selectionKey);
                    } catch (IOException e) {
                        if (null != selectionKey) {
                            selectionKey.cancel();
                        }
                        if(null != selectionKey.channel()){
                            selectionKey.channel().close();
                        }
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
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
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            if(selectionKey.isConnectable()){
                if(socketChannel.finishConnect()){

                    socketChannel.register(selector,SelectionKey.OP_READ);
                    doWrite(socketChannel);

                }else{
                    System.exit(1);
                }

            }
            if(selectionKey.isReadable()){

                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                int count = socketChannel.read(byteBuffer);

                if(count > 0){
                    byteBuffer.flip();
                    byte[] bytes = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bytes);

                    String msg = new String(bytes,"UTF-8");
                    System.out.println("接受到服务器消息" + msg);

                    this.stop = true;
                }else if(count < 0){
                    socketChannel.close();
                }

            }
        }
    }

    private void doConnect()throws IOException{

        boolean connect = socketChannel.connect(new InetSocketAddress(host,port));
        if(connect){
            socketChannel.register(selector,SelectionKey.OP_READ);
            doWrite(socketChannel);
        }else{
            socketChannel.register(selector,SelectionKey.OP_CONNECT);

        }
    }

    private void doWrite(SocketChannel socketChannel)throws IOException{

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        byteBuffer.put("QUERY TIME SERVER".getBytes());

        byteBuffer.flip();
        socketChannel.write(byteBuffer);

        if(!byteBuffer.hasRemaining()){
            System.out.println("客户端成功发出消息");
        }

    }
}
