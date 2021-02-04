package DayPracitice.reverse_linked_list;

public class Solution {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else {
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = head.next;
            while (true) {
                curr.next = prev;
                prev = curr;
                if (next == null) {
                    return curr;
                }
                curr = next;
                next = next.next;
            }
        }
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        } else {
            ListNode newNode = new ListNode(head.val);
            while (head.next != null) {
                head = head.next;
                ListNode node = new ListNode(head.val);
                node.next = newNode;
                newNode = node;
            }
            return newNode;
        }
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