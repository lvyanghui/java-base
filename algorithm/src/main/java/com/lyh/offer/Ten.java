package com.lyh.offer;

/**
 * Created by lvyanghui
 * 2021/8/23 21:36
 */
public class Ten {

    public static int numberOf1(int n){
        int count = 0;
        while (n != 0){
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOf1(100));
    }

}
