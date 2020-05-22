package com.lzz.leetcode;

/**
 * 合并两个正序链表
 */
public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l3;
        ListNode l5 = new ListNode(4);
        l3.next = l5;
        ListNode l2 = new ListNode(1);
        ListNode l4 = new ListNode(6);
        l2.next = l4;
        ListNode l6 = new ListNode(7);
        l4.next = l6;
        ListNode listNode = mergeTwoLists(l1, l2);

        System.out.println(listNode);
    }
}
