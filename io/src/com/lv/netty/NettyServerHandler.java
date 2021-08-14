package com.lv.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledDirectByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

import java.util.Date;

/**
 * Created by lvyanghui on 2018/4/9.
 */
public class NettyServerHandler extends ChannelHandlerAdapter{

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf buf = (ByteBuf)msg;

        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);

        String body = new String(req,"UTF-8");
        System.out.println("The netty server (Thread " + Thread.currentThread() + ") receiver order " + body);
        String currentTime = "QUERY TIME SERVER".equalsIgnoreCase(body) ? new Date().toString() : "BAD OERDER";

        ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());
        ctx.writeAndFlush(resp);
    }
}
