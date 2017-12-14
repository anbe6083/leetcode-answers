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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        Queue<TreeNode> currLevel = new LinkedList<TreeNode>();
        currLevel.add(root);
        while(!currLevel.isEmpty()) {
            TreeNode currentNode = currLevel.poll();
            if(currentNode != null) {
                TreeNode temp = currentNode.left;
                currentNode.left = currentNode.right;
                currentNode.right = temp;
                currLevel.add(currentNode.left);
                currLevel.add(currentNode.right);
            }
        }
        return root;
    }
}