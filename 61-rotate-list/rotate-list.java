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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        else {
            ListNode temp = head;
            int length = 1;
            while(temp.next != null) {
                length++;
                temp = temp.next;
            }
            k = k % length;
            if (k == 0) return head;
            ListNode end = temp;
            temp = head;
            for(int i = k + 1; i < length; i++)
                temp = temp.next;
            end.next = head;
            head = temp.next;
            temp.next = null;
            return head;
        }
    }
}