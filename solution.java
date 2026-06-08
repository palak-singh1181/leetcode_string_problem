class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode check = head;
        int count = 0;
        while (check != null && count < k) {
            check = check.next;
            count++;
        }
        
        if (count < k) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        int i = 0;
        while (i < k) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        
        head.next = reverseKGroup(curr, k);
        
        return prev;
    }

    public static void main(String[] args) {
        
        // Input: 1->2->3->4->5, k=2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        solution sol = new solution();
        ListNode result = sol.reverseKGroup(head, 2);

        // Print result
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print("->");
            result = result.next;
        }
        // Output: 2->1->4->3->5
    }
}
    
