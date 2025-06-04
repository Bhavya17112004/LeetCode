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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head, temp = head, prev = null, next = null, end = null;
        ListNode rev = new ListNode(0, null);
        ListNode curr2 = rev;
        int i = 0;
        while (curr != null) {
            while(curr != null && i < k) {
                if (i == 0) end = curr;
                i++;
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if (i == k) {
                curr2.next = prev;
                curr2 = end;
                prev = null;
                i = 0;
            }
            if (i != 0) {
                curr = prev;
                prev = null;
                while(curr != null) {
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                curr2.next = prev;
                curr2 = end;
                prev = null;
            }
        }
        return rev.next;
    }
}