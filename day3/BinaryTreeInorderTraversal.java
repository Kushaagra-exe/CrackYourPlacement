class Solution {
    public void in(TreeNode r, List<Integer> res){
        if(r==null) return;
        in(r.left,res);
        res.add(r.val);
        in(r.right,res);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        in(root,res);
        return res;   
    }
}