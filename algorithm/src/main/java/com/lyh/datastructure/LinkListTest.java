package com.lyh.datastructure;

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

        SingleLinkList linkList2 = new SingleLinkList();
        linkList2.createLinkList(5);
        System.out.println("----------");
        linkList2.showAll();


        System.out.println("----------");
        linkList2.clear();
        linkList2.showAll();
    }
}
