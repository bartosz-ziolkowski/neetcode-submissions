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
// 1 -> 2 -> 4 -> 5
class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = fast;
            fast = fast.next;
        }
        if (fast.val == 9) {
            fast.val = 0;
            slow.val++;
        } else {
            fast.val++;
        }
        return head;
    }
}
