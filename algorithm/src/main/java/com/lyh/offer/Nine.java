package com.lyh.offer;

/**
 * Created by lvyanghui
 * 2021/8/22 15:25
 */
public class Nine {


    public static long fibonacci(int n){

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        long result = 0;
        long preOne = 1;
        long preTwo = 0;

        for (int i = 2; i < n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    public static long jumpFloor(int n){

        if(n < 3){
            return n;
        }

        long result = 0;
        long preOne = 2;
        long preTwo = 1;

        for (int i = 3; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    public static int jumpFloor2(int n){
        return (int)Math.pow(2,n - 1);
    }

    public static int rectCover(int target){
        if(target <= 0){
            return 0;
        }else if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return rectCover(target - 1) + rectCover(target - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));

        System.out.println(jumpFloor(8));
        System.out.println(jumpFloor2(3));
        System.out.println(rectCover(5));
    }
}
