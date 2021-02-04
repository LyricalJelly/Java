package DayPracitice.remove_linked_list_elements;

//删除链表中等于给定值 val 的所有节点

public class Solution {
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        } else {
            while (head.val == val) {
                head = head.next;
                if (head == null) {
                    return null;
                }
            }
            ListNode prev = head;
            ListNode curr = prev.next;
            while (curr != null) {
                if (curr.val == val) {
                    prev.next = curr.next;
                    curr = prev.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}