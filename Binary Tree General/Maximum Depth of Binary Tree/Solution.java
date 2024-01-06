// Time Complexity: O(n)
// Space Complexity: O(h) where h is the height of the tree

public class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }

    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    return Math.max(leftDepth, rightDepth) + 1;
  }
}
