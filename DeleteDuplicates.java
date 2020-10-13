/**
 * 移除链表中元素重复的元素，
 */
public class DeleteDuplicates {

    /**
     * 删除重复的元素，保留一个 1,2,2,3  输出1,2,3
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (head != null && head.next != null){
            if(head.val == head.next.val )
                head.next = head.next.next;
            else
                head = head.next;
        }
        return temp;
    }

    /**
     * 删除重复的元素 不保留 1,2,2,3 输出1,3
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode temp = head;

        while (head != null && head.next != null){
            if(head.val == head.next.val)
                head = head.next;
            else
                head = head.next.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        ListNode listNode = deleteDuplicates(head);
        System.out.println(listNode);
    }
}
