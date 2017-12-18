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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        Queue<TreeNode> children = new LinkedList<TreeNode>();
        Queue<TreeNode> parent = new LinkedList<TreeNode>();
        double total = 0, numOfLevelNodes = 0, average = 0.0;
        parent.add(root);
        while(!parent.isEmpty()) {
            TreeNode currNode = parent.poll();
            if(currNode != null) {
                System.out.println(currNode.val);
                if(currNode.left != null) children.add(currNode.left);
                if(currNode.right != null) children.add(currNode.right);
                total += currNode.val;
                numOfLevelNodes++;
                if(parent.size() == 0) {
                    average = total / numOfLevelNodes;
                    result.add(average);
                    total = 0;
                    numOfLevelNodes = 0;
                    average = 0.0;
                    parent = children;
                    children = new LinkedList<TreeNode>();
                }
            }
        }
        return result;
    }
}