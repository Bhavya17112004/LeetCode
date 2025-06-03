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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        else {
            ListNode start1 = new ListNode(0, null);
            ListNode start2 = new ListNode(0, null);
            ListNode end1 = start1;
            ListNode end2= start2;
            while(head != null) {
                if (head.val < x) {
                    end1.next = head;
                    end1 = end1.next;
                }
                else {
                    end2.next = head;
                    end2 = end2.next;
                }
                head = head.next;
            }
            end2.next = null;
            end1.next = start2.next;
            return start1.next;
        }
    }
}