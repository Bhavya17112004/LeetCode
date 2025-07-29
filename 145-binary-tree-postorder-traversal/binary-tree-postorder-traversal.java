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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        return postorder(root, result);
    }
    private List<Integer> postorder(TreeNode root, List<Integer> result) {
        if (root.left != null) postorder(root.left, result);
        if (root.right != null) postorder(root.right, result);
        if (root != null) result.add(root.val);
        return result;
    }
}