# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, s):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: List[List[int]]
        """
        return self.pathSumHelper(root, s, [])
    
    def pathSumHelper(self, root, s, l):
        if not root:
            return []
        if not root.left and not root.right and s == root.val:
            return [l + [root.val]]
        
        returnL = self.pathSumHelper(root.left, s - root.val, l + [root.val])
        returnL.extend(self.pathSumHelper(root.right, s - root.val, l + [root.val]))
        return returnL