/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        return preorder(root, result);
    }
    private List<Integer> preorder(TreeNode root, List<Integer> result) {
        if (root != null) result.add(root.val);
        if (root.left != null) preorder(root.left, result);
        if (root.right != null) preorder(root.right, result);
        return result;
    }
}