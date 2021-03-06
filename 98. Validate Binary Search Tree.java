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
    public boolean isValidBST(TreeNode root) {
        return validateBST( root, Long.MIN_VALUE, Long.MAX_VALUE );
    }
    public boolean validateBST(TreeNode root, long min, long max) {
        if(root == null)
            return true;
        if(root.val >= max || root.val <= min) 
            return false;
        return validateBST(root.left, min, root.val) && validateBST(root.right, root.val, max);
    }
}