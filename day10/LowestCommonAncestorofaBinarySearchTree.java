//approach 1s
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parent=root.val;
        int pval=p.val;
        int qval=q.val;
        if(pval>parent && qval>parent){
           return lowestCommonAncestor(root.right,p,q);
        }
        else if(pval<parent && qval < parent){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return root;
        }
    
    }
}

// approach 2 optimal

 class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = p.val;
        int b = q.val;

        if(a<root.val && b<root.val) return lowestCommonAncestor(root.left, p, q);
        else if(a>root.val && b>root.val) return lowestCommonAncestor(root.right, p, q);
        else return root;



    }
}