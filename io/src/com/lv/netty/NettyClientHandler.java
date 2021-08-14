package com.lv.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created by lvyanghui on 2018/4/9.
 */
public class NettyClientHandler extends ChannelHandlerAdapter{

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf buf = (ByteBuf) msg;

        byte[] bytes = new byte[buf.readableBytes()];
        buf.readBytes(bytes);
        String body = new String(bytes,"UTF-8");
        System.out.println("Now is " + body);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        byte[] msg = "QUERY TIME SERVER".getBytes();
        for (int i = 0; i < 5; i++) {
            ByteBuf buf = Unpooled.buffer(msg.length);
            buf.writeBytes(msg);
            ctx.writeAndFlush(buf);
        }
        System.out.println("Client send msg QUERY TIME SERVER");

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
