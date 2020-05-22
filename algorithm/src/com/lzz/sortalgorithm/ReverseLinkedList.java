package com.lzz.sortalgorithm;

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
    public static Node reverseList(Node node) {
        Node pre = null;
        Node next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
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
