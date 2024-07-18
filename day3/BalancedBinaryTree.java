package day3;

import javax.swing.tree.TreeNode;

public class BalancedBinaryTree {
    class Solution {
    public int helper(TreeNode root){
        if(root == null) return 0;
        int lh = helper(root.left);
        int rh = helper(root.right);
        if(Math.abs(lh-rh)>1) return -1;
        if(lh == -1 || rh == -1) return -1;
        return 1+Math.max(lh,rh);

    }
    public boolean isBalanced(TreeNode root) {
        return !(helper(root)==-1);
    }
}
}
