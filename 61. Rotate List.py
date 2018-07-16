# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if k == 0 or not head or not head.next:
            return head
        
        length = 1
        curr = head
        while curr.next:
            curr = curr.next
            length += 1
            
        fast = head
        slow = head
        
        rotate = k % length
        
        if rotate == 0:
            return head
        
        for _ in range(rotate):
            fast = fast.next
            
        while fast.next:
            slow = slow.next
            fast = fast.next
            
        temp = slow.next
        slow.next = None
        fast.next = head
        head = temp
        
        return head