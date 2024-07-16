
public class SubtreeofAnotherTree {
    class Solution {
    public boolean subCheck(TreeNode a, TreeNode b){
        if(a==null && b==null) return true;
        if(a==null && b!=null || a!=null && b==null) return false;

        if(a.val != b.val) return false;
        boolean c1 = subCheck(a.left, b.left);
        boolean c2 = subCheck(a.right, b.right);
        return c1 && c2;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root==null && subRoot!=null) return false;
        
        if(subCheck(root,subRoot)) return true;
        if(isSubtree(root.left,subRoot)) return true;
        if(isSubtree(root.right,subRoot)) return true;
        return false;
    }
}
}
