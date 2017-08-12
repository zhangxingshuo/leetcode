/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode newTree = new TreeNode(root.val);
        newTree.left = invertTree(root.right);
        newTree.right = invertTree(root.left);
        return newTree;
    }
}