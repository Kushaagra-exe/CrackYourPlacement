import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class ConstructBinaryTreefromPreorderandPostorderTraversal {
    lass Solution {
    int preIndex=0;
    TreeNode construct(int postStart, int postEnd, int[] preorder ,HashMap<Integer, Integer> map){
        
        if(postStart>postEnd) return null;
        // create next Node 
        TreeNode node = new TreeNode(preorder[preIndex]);
        // check for leaf node
        ++preIndex;
        if(postStart == postEnd) return node;
        int postIndex = map.get(preorder[preIndex]);
        node.left = construct(postStart, postIndex, preorder, map);
        node.right= construct(postIndex+1, postEnd-1, preorder, map);
        return node;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<postorder.length; i++){
            map.put(postorder[i],i);            
        }
        return construct(0,postorder.length-1,preorder,map);
    }
}
}
