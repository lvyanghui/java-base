package com.lv.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Created by lvyanghui on 2018/4/9.
 */
public class NettyClient {

    public static void main(String[] args){
        int port = 8080;
        new NettyClient().connect(port);
    }

    public void connect(int port){

        EventLoopGroup worker = new NioEventLoopGroup();

        try{
            Bootstrap client = new Bootstrap();

            client.group(worker).
                    channel(NioSocketChannel.class).
                    option(ChannelOption.TCP_NODELAY,true).
                    handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new NettyClientHandler());
                        }
                    });

            ChannelFuture cf = client.connect("127.0.0.1",port).sync();

            System.out.println("The client connect in port "+ port);
            cf.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            worker.shutdownGracefully();
        }

    }
}
