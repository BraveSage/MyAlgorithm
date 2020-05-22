package com.lzz.leetcode;


public class ReserveLinkedList {

    Node head;

    Node last;

    int size = 0;
    class Node{
        Node next;
        int val;

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }

        public Node(int val){
            this(null,val);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", val=" + val +
                    '}';
        }
    }

    public Node findPrevNode(int val){

        if(head ==null){
            throw new NullPointerException();
        }
        Node node = head;
        for (int i = 1; i < size ; i++){
            if(node.next.val == val){
                return node;
            }
            node = node.next;
            if (i == size -1){
                throw new NullPointerException("not found val in LinkedList");
            }
        }
        return node;
    }

    public void reverseKGroup() {

        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        head = pre;
//        return pre;

    }

    public void add(int val){

        if(head == null){
            head = new Node(val);
            last = head;
        }else {
            last = last.next = new Node(val);
        }
        size ++;
    }

    @Override
    public String toString() {
        return "ReserveLinkedList{" +
                "head=" + head +
                ", last=" + last +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ReserveLinkedList linkedList = new ReserveLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.reverseKGroup();

        System.out.println(linkedList);


    }

    void reserveArray(int[] array){
        int temp;
        int length = array.length>>1;
        for (int i = 0; i < length; i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
