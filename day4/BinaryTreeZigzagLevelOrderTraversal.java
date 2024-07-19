package day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {
    class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean ct =true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> t = new ArrayList<Integer>();
            for(int i =0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                if(ct) t.add(curr.val);
                else t.add(0,curr.val);

            }
            res.add(t);
            ct=!ct;
        }
        return res;
    }
}
}
