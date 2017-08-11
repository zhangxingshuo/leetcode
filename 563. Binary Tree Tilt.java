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
    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        else return tilt(root) + findTilt(root.left) + findTilt(root.right);
    }
    
    public int tilt(TreeNode node) {
        if (node == null) return 0;
        else return Math.abs(sum(node.left) - sum(node.right));
    }
    
    public int sum(TreeNode node) {
        if (node == null) return 0;
        else return node.val + sum(node.left) + sum(node.right);
    }
}