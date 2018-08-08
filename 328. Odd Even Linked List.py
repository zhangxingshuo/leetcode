# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None:
            return head 
        
        odd = head
        even = even_head = head.next 
        
        while even and even.next:
            odd_tmp = odd.next.next
            even_tmp = even.next.next 
            
            odd.next = odd_tmp
            even.next = even_tmp
            
            odd = odd_tmp
            even = even_tmp
            
        odd.next = even_head
        return head