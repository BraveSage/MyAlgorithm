package com.lzz.leetcode;

/**
 * 反转链表
 */
public class ReverseLinkedList {

    //递归
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
    //循环
    public static Node reverseList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

class Node {
    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;
    }
}
