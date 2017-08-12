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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }
    
    public TreeNode construct(int[] nums, int left, int right) {
        if (left == right) return null;
        int max_ind = max(nums, left, right);
        TreeNode tree = new TreeNode(nums[max_ind]);
        tree.left = construct(nums, left, max_ind);
        tree.right = construct(nums, max_ind + 1, right);
        return tree;
    }
    
    public int max(int[] nums, int left, int right) {
        int max_ind = left;
        for (int i = left; i < right && i < nums.length; i++) {
            if (nums[i] > nums[max_ind]) max_ind = i;
        }
        return max_ind;
    }
}