# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True 
        
        first = True
        lastseen = None
        for elem in self.inorder(root):
            if first:
                lastseen = elem
                first = False
            else:
                if elem <= lastseen:
                    return False
                lastseen = elem
        return True
    
    def inorder(self, root):
        if root.left:
            for elem in self.inorder(root.left):
                yield elem
        yield root.val
        if root.right:
            for elem in self.inorder(root.right):
                yield elem