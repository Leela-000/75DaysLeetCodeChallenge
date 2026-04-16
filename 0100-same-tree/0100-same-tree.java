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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: both nodes are null → trees are identical here
        if (p == null && q == null) return true;
        
        // If one is null and the other isn’t → mismatch
        if (p == null || q == null) return false;
        
        // If values differ → mismatch
        if (p.val != q.val) return false;
        
        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}