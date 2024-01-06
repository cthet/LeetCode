// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of the tree

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
  public TreeNode invertTree(TreeNode root) {
      if (root == null) {
          return null;
      }

      if (root == null) return null;
      TreeNode node = new TreeNode(root.val);
      node.right = invertTree(root.left);
      node.left = invertTree(root.right);
      return node;
  }
  
}