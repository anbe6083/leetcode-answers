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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTreeHelper(nums, 0, nums.length - 1);
    }
    
    public TreeNode constructMaximumBinaryTreeHelper(int[] nums, int low, int high) {
        if(high < low) 
            return null;
        int maxNum = Integer.MIN_VALUE, maxIndex = Integer.MIN_VALUE;
        for(int i = low; i <= high; i++) {
            if(nums[i] > maxNum) {
                maxNum = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(maxNum);
        root.left = constructMaximumBinaryTreeHelper(nums, low, maxIndex - 1);
        root.right = constructMaximumBinaryTreeHelper(nums, maxIndex + 1, high);
        return root;
    }
}