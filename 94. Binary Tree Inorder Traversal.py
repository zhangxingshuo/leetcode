# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        return self.traverse(root, [])
            
    
    def traverse(self, root, L):
        if root is None:
            return L

        self.traverse(root.left, L)
        L += [root.val]
        self.traverse(root.right, L)
        return L