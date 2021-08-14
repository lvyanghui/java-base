package com.lv.singleton;

/**
 * Created by lvyanghui on 2018/4/30.
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton(){

    }

    /*public static synchronized Singleton getInstance(){
        if(null == singleton){
            singleton = new Singleton();
        }
        return singleton;
    }*/


    /*public static Singleton getInstance(){
        if(null == singleton){
            synchronized (singleton){
                singleton = new Singleton();
            }
        }
        return singleton;
    }*/


    /*public static synchronized void sysinit(){
        if(null == singleton){
            singleton = new Singleton();
        }
    }

    public static Singleton getInstance(){
        if(null == singleton){
            sysinit();
        }
        return singleton;
    }*/

    private static class SingletonFactory{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.singleton;
    }
}
