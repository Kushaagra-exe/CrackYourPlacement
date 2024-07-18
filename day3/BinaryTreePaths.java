package day3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreePaths {
    class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        helper(root, ints, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> ints, List<String> res){
        if(root==null) return;
        ints.add(root.val);

        if(root.left==null && root.right==null){
            res.add(convert(ints));
        }
        else{
            helper(root.left, ints, res);
            helper(root.right, ints, res);
        }
        ints.remove(ints.size()-1);

    }
    public String convert(List<Integer> ints){
        StringBuilder s = new StringBuilder();
        for(int i=0; i<ints.size(); i++){
            s.append(ints.get(i));
            if(i<ints.size()-1) s.append("->");
        }
        return s.toString();
    }
}

}
