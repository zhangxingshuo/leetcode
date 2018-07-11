# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def advance(self, node, n):
        for _ in range(n):
            if not node:
                return node 
            else:
                node = node.next
        return node

    def remove(self, prev, curr):
        prev.next = curr.next

    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        prev = head 
        curr = head
        fast = head

        fast = self.advance(fast, n)

        first = True
        while fast:
            if first:
                first = False
                curr = curr.next
                fast = fast.next
            else:
                prev = curr 
                curr = curr.next
                fast = fast.next

        if prev == curr:
            head = head.next
        else:
            self.remove(prev, curr)
        return head