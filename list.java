
// RemoveNthFromEnd.java
public class list {
    
    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    // main method for local testing
    public static void main(String[] args) {
        list sol = new list();

        // 1 -> 2 -> 3 -> 4 -> 5, n=2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = sol.removeNthFromEnd(head, 2);

        // print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 1 2 3 5
    }
}
