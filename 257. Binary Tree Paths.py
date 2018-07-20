# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        return ["->".join(l) for l in self.helper(root, [])]
    
    def helper(self, root, l):
        if not root:
            return []
        if not root.left and not root.right:
            return [l + [str(root.val)]]
        
        returnL = self.helper(root.left, l + [str(root.val)])
        returnL.extend(self.helper(root.right, l + [str(root.val)]))
        return returnL