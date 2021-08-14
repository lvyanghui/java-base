package com.lyh.socketrpc.server;

import com.lyh.socketrpc.IHello;

/**
 * Created by lvyanghui
 * 2021/7/3 16:16
 */
public class HelloImpl implements IHello{
    @Override
    public String sayHello(String msg) {
        return "你好".concat(msg);
    }
}
