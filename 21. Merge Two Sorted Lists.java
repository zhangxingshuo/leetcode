/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else if (l1.val < l2.val) {
            ListNode newList = new ListNode(l1.val);
            newList.next = mergeTwoLists(l1.next, l2);
            return newList;
        }
        else {
            ListNode newList = new ListNode(l2.val);
            newList.next = mergeTwoLists(l1, l2.next);
            return newList;
        }
    }
}