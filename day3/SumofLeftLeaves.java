package day3;

import javax.swing.tree.TreeNode;

public class SumofLeftLeaves {
        class Solution {
    public int helper(TreeNode m, int a){
        if(m==null) return 0;
        if(m.left==null && m.right==null) {
            if(a==1) return m.val;
            else return 0;
        }
        return helper(m.left,1)+helper(m.right,0);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,0);
    }
}
}
