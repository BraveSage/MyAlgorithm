package com.lzz.leetcode;

/**
 * 删除链表节点
 */
public class DeleteNode {

    private ListNode head;

    private ListNode last;

    private int size = 0;

    private static class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this(val,null);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void deleteNode(ListNode node) {
        if(node.next == null){
            node = null;
        }else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public void add(int val){

        if(head == null){
            head = new ListNode(val);
            last = head;
        }else {
            last = last.next = new ListNode(val);
        }
        size ++;
    }

    public void deleteNode(int val) {
        ListNode prevNode = findPrevNode(val);
        if(head.val == val){
            head = head.next;
            size--;
        }else {
            if(prevNode.next.next!=null) {
                prevNode.next = prevNode.next.next;
                size--;
            }else {
                prevNode.next = null;
                size--;
            }
        }
    }

    public ListNode findPrevNode(int val){

        if(head ==null){
            throw new NullPointerException();
        }
        ListNode node;
        node = head;
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

    @Override
    public String toString() {
        return "DeleteNode{" +
                "head=" + head +
                ", last=" + last +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        DeleteNode linkList = new DeleteNode();
        linkList.add(3);
        linkList.add(2);
        linkList.add(4);
        linkList.add(5);
        linkList.deleteNode(4);

        linkList.add(6);
        System.out.println(linkList);

        System.out.println();

    }
}
