package com.lyh.offer;

import java.util.Stack;

/**
 * Created by lvyanghui
 * 2021/8/16 22:05
 */
public class Seven {

    public static Stack<Integer> stack1 = new Stack();
    public static Stack<Integer> stack2 = new Stack();

    public static void push(int node){
        stack1.push(node);
    }

    public static int pop() throws Exception{
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new Exception("栈为空");
        }
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) throws Exception{
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }
}
