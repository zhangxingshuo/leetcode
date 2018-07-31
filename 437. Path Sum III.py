# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: int
        """
        if root is None:
            return 0
        
        return self.pathFromSum(root, sum) + self.pathSum(root.right, sum) + self.pathSum(root.left, sum)
    
    def pathFromSum(self, node, sum):
        if node is None:
            return 0
        if node.val == sum:
            sumAtNode = 1
        else:
            sumAtNode = 0
        return sumAtNode + self.pathFromSum(node.left, sum - node.val) + self.pathFromSum(node.right, sum - node.val)