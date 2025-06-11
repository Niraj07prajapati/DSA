class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Link them
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Uncomment below to create a cycle: -4 → node2
        node4.next = node2;

        // Pass head to hasCycle
        LinkedListCycle obj = new LinkedListCycle();
        boolean result = obj.hasCycle(node1);

        // Output
        System.out.println("Has cycle =  " + result); // Output: true
    }
}
