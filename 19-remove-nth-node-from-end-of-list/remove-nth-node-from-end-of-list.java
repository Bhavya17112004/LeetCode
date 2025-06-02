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
        ListNode dummy = new ListNode(0, null);
        dummy.next = head;
        int size = 0;
        while(head != null) {
            head = head.next;
            size++;
        }
        n = size - n + 1;
        ListNode temp = dummy;
        for(int i = 1; i < n; i++) temp = temp.next;
        temp.next = temp.next.next;
        return dummy.next;
    }
}