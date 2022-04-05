package com.lyh.datastructure.linklist;

public class SingleLinkList {

    private Node head;
    private int size;

    public SingleLinkList() {
        head = new Node();
    }

    public void createLinkList(){
        head.setNext(null);
        this.size = 0;
    }

    public void createLinkList(int n){

        Node temp = head;
        for (int i = 0; i < n; i++) {
            Node node = new Node();
            temp.setNext(node);
            temp = node;
            size++;
        }
    }

    public void showAll(){
        if(null == this || 0 == this.size){
            return;
        }

        Node temp = this.head.getNext();
        while (temp != null){
            System.out.println(temp.getVal());
            temp = temp.getNext();
        }
    }

    public void insertHead(int val){
        if(null == this){
            System.out.println("linklist未初始化");
            return;
        }

        Node node = new Node();
        node.setVal(val);

        Node temp = this.head;
        if(0 == this.size){
            temp.setNext(node);
            size++;
            return;
        }

        node.setNext(temp.getNext());
        temp.setNext(node);
        size++;
    }


    public void insert(int val){
        if(null == this){
            System.out.println("linklist未初始化");
            return;
        }

        Node last = new Node();
        last.setVal(val);

        Node temp = this.head;
        if(0 == this.size){
            temp.setNext(last);
            size++;
            return;
        }

        for (int i = 0; i <= this.size - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(last);
        size++;
    }

    public void insert(int val, int index){
        if(null == this){
            System.out.println("linklist未初始化");
            return;
        }
        if(index > this.size){
            System.out.println("linklist越界");
        }

        Node node = new Node();
        node.setVal(val);

        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        node.setNext(temp.getNext());
        temp.setNext(node);
        size++;
    }

    public void deleteVal(int val){

        if(null == this || 0 == this.size){
            return;
        }

        Node pre = this.head;
        Node temp = this.head.getNext();
        while (temp != null){
            if(val == temp.getVal()){
                pre.setNext(temp.getNext());
                temp = null;
                size--;
                break;
            }
            pre = temp;
            temp = temp.getNext();
        }
    }

    public void deleteIndex(int index){
        if(null == this){
            System.out.println("linklist未初始化");
            return;
        }
        if(index > this.size){
            System.out.println("linklist越界");
        }

        Node temp = this.head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }
        Node del = temp.getNext();
        temp.setNext(del.getNext());
        del = null;
        size--;
    }

    public void clear(){
        if(null == this){
            System.out.println("linklist未初始化");
            return;
        }

        Node temp = this.head;
        while (temp != null){
            Node cur = temp;
            temp = temp.getNext();
            cur = null;
        }
        head = null;
        size = 0;
    }

    public void reverse(){
        if(null == this){
            System.out.println("linklist未初始化");
            return;
        }

        if(0 == size || 1 == size){
            return;
        }

        Node node = head.getNext();
        Node pre = null;
        while (node != null) {
            Node next = node.getNext();
            node.setNext(pre);
            pre = node;
            node = next;
        }
        this.head.setNext(pre);
    }
}
