package com.lzz.leetcode;

public class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp;
        ListNode prev = null;
        ListNode head = null;

        int t;
        int carry = 0;
        while(l1 != null || l2 !=null) {
            t = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = 0;
            if (t > 9) {
                t -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            temp = new ListNode(t);
            if (head == null) {
                prev = head = temp;
            } else {
                prev.next = temp;
                prev = temp;
            }
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1) {
            temp = new ListNode(1);
            carry = 0;
            if (prev == null) {
                head = prev = temp;
            } else {
                prev.next = temp;
                prev = temp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l3;
        ListNode l5 = new ListNode(3);
        l3.next = l5;
        ListNode l2 = new ListNode(5);
        ListNode l4 = new ListNode(6);
        l2.next = l4;
        ListNode l6 = new ListNode(4);
        l4.next = l6;
        ListNode listNode = addTwoNumbers(l1, l2);

        System.out.println(listNode);


    }
}
 class ListNode {
     int val;
     ListNode next;
      ListNode(int x) { val = x; }
}


