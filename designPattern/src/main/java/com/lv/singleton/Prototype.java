package com.lv.singleton;

import java.io.*;

/**
 * Created by lvyanghui on 2018/5/1.
 */
public class Prototype implements Cloneable{

    public Prototype clone()throws CloneNotSupportedException{
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    public Prototype deepClone()throws IOException,ClassNotFoundException{

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Prototype prototype = (Prototype) objectInputStream.readObject();
        return null;
    }
}
