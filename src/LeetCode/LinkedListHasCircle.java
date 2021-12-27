package LeetCode;


public class LinkedListHasCircle {

   // 快慢指针   把链表比作一条跑道, 链表中有环, 那么这条跑道就是一条圆环跑道，在圆环跑道中，两个人有速度差，那么迟早两个人会相遇
    public static void main(String[] args) {

    }

    // 模型节点
    static class Node {
        Node next;
    }


    public static boolean method(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }





}
