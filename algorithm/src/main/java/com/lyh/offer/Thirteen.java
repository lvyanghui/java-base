package com.lyh.offer;

/**
 * Created by lvyanghui
 * 2021/9/1 22:31
 */
public class Thirteen {

    public void deleteNode(ListNode head, ListNode deListNode){
        if(deListNode == null || head == null){
            return;
        }
        if(head == deListNode){
            head = null;
        }else{
            if(deListNode.next == null){
                ListNode point = head;
                while (point.next.next != null){
                    point = point.next;
                }
                point.next = null;
            }else{
                deListNode.val = deListNode.next.val;
                deListNode.next = deListNode.next.next;
            }
        }
    }

    public static void main(String[] args) {
        Thirteen thirteen = new Thirteen();

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

        thirteen.deleteNode(node1,node10);
        ListNode node = node1;
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
