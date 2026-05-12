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

// 1 -> 4 -> 5 -> 4 -> 1
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();

        while (head != null) {
            vals.add(head.val);
            head = head.next;
        }

        int l = 0, r = vals.size() - 1;
        while (l <= r) {
            if (vals.get(l) != vals.get(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}