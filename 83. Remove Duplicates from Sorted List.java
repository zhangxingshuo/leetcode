/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            int curVal = cur.val;
            ListNode n = cur.next;
            while (n != null && n.val == curVal)
                n = n.next;
            cur.next = n;
            cur = cur.next;
        }
        return head;
    }
}