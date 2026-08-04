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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        // If there is only one node no reversal is needed
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        // Move to the left position
        for(int i=1; i<left; i++)
        {
            prev = current;
            current = current.next;
        }

        // Store important nodes
         ListNode first = prev;// Node before left
         ListNode last = current;  //  Left node will become last after reversing

        //  Reverse from left to right
        ListNode next = null;
        for(int i=left; i<=right; i++)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Connect the first part eith reversed part
        if(first!=null)
        {
            first.next = prev;
        }
        else
        {
            head = prev;
        }
        // connect the reversed part with reamianing list

        last.next = current;


        return head;

    }
}
