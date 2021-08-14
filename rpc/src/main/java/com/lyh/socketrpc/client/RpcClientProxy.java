package com.lyh.socketrpc.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lvyanghui
 * 2021/7/3 16:44
 */
public class RpcClientProxy<T> implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
