package com.lyh.offer;

import java.util.Stack;

/**
 * Created by lvyanghui
 * 2021/8/16 22:05
 */
public class Seven {

    public Stack<Integer> stack1 = new Stack();
    public Stack<Integer> stack2 = new Stack();
    public void push(int node){
        stack1.push(node);
    }

    public int pop() throws Exception{
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

    public static void main(String[] args) {

    }
}
