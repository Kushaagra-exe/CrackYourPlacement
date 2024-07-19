// Approach 1 bfs

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for(int i = 0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left!=null) q.offer(curr.left);   
                if(curr.right!=null) q.offer(curr.right);
                temp.add(curr.val);
            }
            res.add(temp.get(temp.size()-1));
        }
        return res;
    }
}


// Approach 2 dfs

class Solution {
    public void helper(TreeNode root, List<Integer> res, int level){
        if(root == null) return;

        if(level>=res.size()) res.add(root.val);
        helper(root.right, res, level+1);
        helper(root.left, res, level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
}
