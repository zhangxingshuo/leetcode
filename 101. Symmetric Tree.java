/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return equals(root.left, reverse(root.right));
    }
    
    public TreeNode reverse(TreeNode root) {
        if (root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.left = reverse(root.right);
        node.right = reverse(root.left);
        return node;
    }
    
    public boolean equals(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        else if (node1 == null || node2 == null) return false;
        else if (node1.val != node2.val) return false;
        return equals(node1.right, node2.right) && equals(node1.left, node2.left);
    }
}