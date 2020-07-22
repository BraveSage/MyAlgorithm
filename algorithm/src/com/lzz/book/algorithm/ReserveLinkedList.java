package com.lzz.book.algorithm;

public class ReserveLinkedList {

    public static Node reserve(Node x){
        Node head =x;
        Node result = null;
        while (head!=null){
            Node next = head.next;
            head.next = result;
            result = head;
            head = next;
        }
        return result;
    }

    public static Node reserve2(Node head){
        if(head==null)
            return null;
        if(head.next == null)
            return head;
        Node next = head.next;
        Node result = reserve2(next);
        next.next = head;
        head.next = null;
        return result;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node = new Node(2);
        Node node2 = new Node(3);
        head.next = node;
        node.next = node2;

        Node result = reserve3(head);

        System.out.println(result.value);

    }


    public static Node reserve4(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node result = null;
        while (head != null){
            Node next = head.next;
            head.next = result;
            result = head;
            head = next;
        }
        return result;
    }

    public static Node reserve3(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node result = reserve3(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }

}
