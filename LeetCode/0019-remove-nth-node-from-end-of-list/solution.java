/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Find the length of the linked list
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: If the first node has to be deleted
        if (length == n) {
            return head.next;
        }

        // Step 3: Move to the node before the one to be deleted
        temp = head;
        for (int i = 1; i < length - n; i++) {
            temp = temp.next;
        }

        // Step 4: Delete the node
        temp.next = temp.next.next;

        // Step 5: Return the head
        return head;
    }
}
