package LeetCode;

public class ListInversion {
    public static void main(String[] args) {

    }

    static class ListNode {
        ListNode next;
    }

    // 迭代法
    public static ListNode iterate(ListNode head) {
        // 三个指针完美解决
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    // 递归法
    public static ListNode recursion(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode newHead = recursion(head.next);
        // 关键步骤
        head.next.next = head;
        head.next = null;
        return newHead;
    }


}
