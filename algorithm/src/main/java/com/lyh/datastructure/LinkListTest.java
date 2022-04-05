package com.lyh.datastructure;

import com.lyh.datastructure.linklist.ListNode;
import com.lyh.datastructure.linklist.SingleLinkList;

public class LinkListTest {

    public static void main(String[] args) {
        SingleLinkList linkList1 = new SingleLinkList();
        linkList1.createLinkList();

        linkList1.insert(15);
        linkList1.insert(56);
        linkList1.insert(44);
        linkList1.insert(32);
        linkList1.insert(16);
        linkList1.insert(4);
        linkList1.insert(9,3);
        linkList1.showAll();

        System.out.println("----------");
        linkList1.deleteVal(44);
        linkList1.showAll();

        System.out.println("----------");
        linkList1.deleteIndex(5);
        linkList1.showAll();
        System.out.println("----------");
        linkList1.deleteIndex(5);
        linkList1.showAll();

        System.out.println("----------");
        linkList1.insertHead(5);
        linkList1.insertHead(24);
        linkList1.showAll();

        System.out.println("----------");
        linkList1.reverse();
        linkList1.showAll();

        SingleLinkList linkList2 = new SingleLinkList();
        linkList2.createLinkList(5);
        System.out.println("----------");
        linkList2.showAll();


        System.out.println("----------");
        linkList2.clear();
        linkList2.showAll();
    }

    public ListNode reverseList(ListNode head) {

        ListNode next = null;
        ListNode pre = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode p1 = list1, p2 = list2, head = dummy;

        while (p1 != null || p2 != null){
            if(p1 != null && p2 != null && p1.val < p2.val){
                head.next = p1;
                head = head.next;
                p1 = p1.next;
            }else if(p1 != null && p2 != null && p1.val >= p2.val){
                head.next = p2;
                head = head.next;
                p2 = p2.next;
            }else if(p1 != null && p2 == null){
                head.next = p1;
                head = head.next;
                p1 = p1.next;
            }else if(p1 == null && p2 != null){
                head.next = p2;
                head = head.next;
                p2 = p2.next;
            }
        }
        return dummy.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p1 = dummy, p2 = dummy;

        while(p1 != null){
            p1 = p1.next;

            if(n < 1 && p1 != null){
                p2 = p2.next;
            }
            n--;
        }
        p2.next = p2.next.next;

        return dummy.next;
    }

    public int kthToLast(ListNode head, int k) {

        if(head == null || k < 0){
            return -1;

        }

        ListNode p1 = head, p2 = head;
        int count = 0;
        int index = k;
        while(p1 != null){
            p1 = p1.next;
            count++;
            if(k < 1){
                p2 = p2.next;
            }
            k--;
        }
        if(count < index) return -1;
        return p2.val;
    }
}
