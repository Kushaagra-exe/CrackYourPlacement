class GfG {
    int dis(Node a, int b){
        if(a == null) return -1;
        if(a.data == b) return 0;
        int l = dis(a.left,b);
        int r = dis(a.right,b);
        if(l==-1 && r==-1) return -1;
        if(l==-1) return r+1;
        return l+1;
    }
    Node Lca(Node root, int a, int b){
        if(root == null || root.data == a || root.data ==b) return root;
        
        Node left = Lca(root.left, a,b);
        Node right = Lca(root.right, a,b);
        if(left==null && right==null) return null;
        if(left==null) return right;
        if(right==null) return left;
        return root;
    }
    int findDist(Node root, int a, int b) {
        // Your code here 
        Node ac = Lca(root, a, b);
        int dis1 = dis(ac,a);
        int dis2 = dis(ac,b);
        return dis1+dis2;
        
    }
}