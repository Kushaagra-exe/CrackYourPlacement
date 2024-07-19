package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class AllNodesDistanceKinBinaryTree {
    class Solution {
    public void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parents){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null){
                parents.put(curr.left, curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                parents.put(curr.right, curr);
                q.offer(curr.right);
            }

        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parents = new HashMap<>();
        markParents(root, parents);
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        q.offer(target);
        visited.add(target);
        int travel =0;
        while(!q.isEmpty()){
            int size = q.size();
            if(travel == k) break;
            for(int i =0; i<size ;i++){
                TreeNode curr = q.poll();

            
                if(curr.left!=null && !visited.contains(curr.left)){
                    visited.add(curr.left);
                    q.offer(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    visited.add(curr.right);
                    q.offer(curr.right);
                }
                if(parents.get(curr)!=null && !visited.contains(parents.get(curr))){
                    visited.add(parents.get(curr));
                    q.offer(parents.get(curr));
                }
            }
            travel++;


        }
        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            res.add(q.poll().val);

        }
        return res;

    }
}
}
