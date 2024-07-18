class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            if(q.peek().left!= null) q.offer(q.peek().left);
            if(q.peek().right!= null) q.offer(q.peek().right);
            int num = q.poll().val;
            if(num>=low && num<=high) res=res+num;
        }
        return res;
    }
}