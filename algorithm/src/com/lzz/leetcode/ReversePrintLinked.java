package com.lzz.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrintLinked {
    /**
     * 反转链表解法
     * @param head
     * @return
     */
    public static int[] reversePrint(ListNode head) {
        if(head == null){
            return new int[]{};
        }
        if(head.next == null){
            return new int[]{head.val};
        }
        int count = 0;
        ListNode pre = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            count++;
        }
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++){
            nums[i] = pre.val;
            pre = pre.next;
        }
        return nums;
    }

    /**
     * 辅助栈解法
     * @param head 链表
     * @return
     */
    public static int[] reversePrint2(ListNode head) {
        Stack<ListNode> sta = new Stack<>();
        while (head!= null){
            sta.push(head);
            head = head.next;
        }
        int[] nums = new int[sta.size()];
        for (int i = 0; i < nums.length; i ++){
            nums[i] = sta.pop().val;
        }
        return nums;
    }

    static List<Integer> list = new ArrayList();
    public static int[] reversePrint3(ListNode head) {
        test(head);
        int[] nums = new int[list.size() ];
        for (int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return nums;

    }
    public static void test(ListNode head){
        if(head == null){
            return ;
        }
        test(head.next);
        list.add(head.val);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int[] ints = reversePrint3(head);
        System.out.println(ints);
    }
}
