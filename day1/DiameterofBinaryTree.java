
public class DiameterofBinaryTree {
    class Solution {
        int maxi = 0;
        public int height(TreeNode n){
            if(n==null) return 0;
            int left = height(n.left);
            int right = height(n.right);
            maxi = Math.max(maxi, left+right);
            return 1+Math.max(left,right);
        }
        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return maxi;
        }
    }
    
}