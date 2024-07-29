class Solution {
    class Pair{
        TreeNode node;
        int num;
        Pair(TreeNode node_, int num_){
            node= node_;
            num=num_;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int wid=0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            int min= q.peek().num;
            int first =0 , last = 0;
            for(int i =0; i<size; i++){
                Pair curr = q.poll();
                int id = curr.num-min;
                if(i==0) first = id;
                if(i==size-1) last = id;
                if(curr.node.left!=null) q.offer(new Pair(curr.node.left,id*2+1));
                if(curr.node.right!=null) q.offer(new Pair(curr.node.right, id*2+2));

            }
            wid = Math.max(wid,last-first+1);
        }
        return wid;
    }
}