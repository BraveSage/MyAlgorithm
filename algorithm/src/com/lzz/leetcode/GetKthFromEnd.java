package com.lzz.leetcode;

public class GetKthFromEnd {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int position = size - k;
        while(position == 0){
            head = head.next;
            position--;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(3);
        l4.next = l5;

        ListNode kthFromEnd = getKthFromEnd(l1, 3);
        System.out.println(kthFromEnd);

    }
}
