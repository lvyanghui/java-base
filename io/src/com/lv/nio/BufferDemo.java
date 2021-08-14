package com.lv.nio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by lvyanghui on 2018/3/25.
 */
public class BufferDemo {

    private static RandomAccessFile file = null;

    public static void getBufferSign(String str,Buffer buffer){
        System.out.println(str + " buffer capacity " + buffer.capacity() + " buffer position " + buffer.position() + " buffer limit " + buffer.limit());
    }


    public static void main(String[] args){

        try {
            file = new RandomAccessFile("D:\\nio.txt","r");

            FileChannel channel = file.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(48);

            channel.read(buffer);
            getBufferSign("buffer写入数据",buffer);

            buffer.flip();
            getBufferSign("buffer切换模式",buffer);

            for (int i = 0; i < 5; i++) {
                char a = (char)buffer.get();
                System.out.print(a);
            }
            System.out.println();
            getBufferSign("buffer读取5个之后",buffer);

            buffer.rewind();
            getBufferSign("buffer rewind之后",buffer);

            buffer.compact();
            buffer.flip();
            getBufferSign("buffer compact之后",buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
