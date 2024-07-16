
public class InvertBinaryTree {
    class Solution {
        TreeNode helper(TreeNode  n){
            if(n==null) return null;

            TreeNode left = helper(n.left);
            n.left = helper(n.right);
            n.right = left;
            return n;
        }
        public TreeNode invertTree(TreeNode root) {
            helper(root);
            return root;
        }
    }
}
