package com.lyh.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lvyanghui
 * 2021/8/15 10:27
 */
public class RevertLinkList {

    public static List<Integer> revertLink(ListNode headNode){
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while (headNode != null){
            stack.push(headNode.val);
            headNode = headNode.next;
        }

        while (!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }

    public static List<Integer> revertLink1(ListNode headNode){
        List<Integer> result = new ArrayList<>();

        if (headNode != null){
            if(headNode.next != null){
                result = revertLink1(headNode.next);
            }
            result.add(headNode.val);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

        /*List<Integer> revertList = revertLink(node1);
        System.out.println(revertList);*/

        List<Integer> revertList = revertLink1(node1);
        System.out.println(revertList);

        List<Integer> linkedList = new LinkedList();
    }
}
