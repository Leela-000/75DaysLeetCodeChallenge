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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Since it's a BST, we can use its properties:
        // - If both p and q are smaller than root, LCA lies in the left subtree.
        // - If both are greater, LCA lies in the right subtree.
        // - Otherwise, root is the LCA.
        
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root; // Split point found
            }
        }
        return null;
    }
}
