package com.lzz.lineardatastructure;

public class MinStack2 {

    private Node head;

    private class Node{
        int val;
        int min;
        Node next;

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

        public Node(int val, int min) {
            this(val,min,null);
        }
    }

    void push(int val){
        if(head == null){
            head = new Node(val,val);
        }else {
            //每次新增一个数据，那么头为新增数据，记录最小值，前一个node节点向下移
            head = new Node(val, Math.min(head.min, val), head);
        }
    }

    int pop(){
        int val = head.val;
        head = head.next;
        return val;
    }

    int getMin(){
        return head.min;
    }

    int top(){
        return head.val;
    }

    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        System.out.println(minStack.pop());
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
}
