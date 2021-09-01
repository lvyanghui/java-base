package com.lyh.offer;

/**
 * Created by lvyanghui
 * 2021/9/1 21:57
 */
public class Twelve {

    public void printToMaxOfNDigits1(int n){
        int[] array = new int[n];
        if(n <= 0){
            return;
        }
        printArray(array,0);
    }

    public void printToMaxOfNDigits(int n){
        int[] array = new int[n];
        if(n <= 0){
            return;
        }
        printArray(array,0);
    }

    private void printArray(int[] array, int n){
        for (int i = 0; i < 10; i++) {
            if(n != array.length){
                array[n] = i;
                printArray(array,n + 1);
            }else{
                boolean isFirstNo0 = false;
                for (int j = 0; j < array.length; j++) {
                    if(array[j] != 0){
                        System.out.print(array[j]);
                        if(!isFirstNo0){
                            isFirstNo0 = true;
                        }
                    }else{
                        if(isFirstNo0){
                            System.out.print(array[j]);
                        }
                    }
                }
                System.out.println();
                return;
            }
        }
    }

    public static void main(String[] args) {
        Twelve twelve = new Twelve();
        twelve.printToMaxOfNDigits(5);
    }
}
