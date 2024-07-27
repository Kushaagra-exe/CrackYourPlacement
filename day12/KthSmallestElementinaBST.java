package day12;

import java.util.Stack;

import javax.swing.tree.TreeNode;

public class KthSmallestElementinaBST {
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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode c = root;
        int ct = 0;
        while(c!=null || !st.isEmpty()){
            while(c!=null){
                st.push(c);
                c=c.left;
            }
            c = st.pop();
            ct++;
            if(ct==k) return c.val;
            c= c.right;
        }
        return -1;
    }
}
}
