package com.lv.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by lvyanghui on 2018/4/9.
 */
public class NettyServer {

    public static void main(String[] args){
        int port = 8080;
        new NettyServer().bind(port);
    }

    public void bind(int port){
        EventLoopGroup acceptor = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        try{
            ServerBootstrap server = new ServerBootstrap();

            server.group(acceptor,worker)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG,1024)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new NettyServerHandler());
                        }
                    });

            ChannelFuture cf = server.bind(8080).sync();
            System.out.println("The server is start in port " + port);
            cf.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            acceptor.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
