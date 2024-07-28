package day13;

public class FlattenBinaryTreetoLinkedList {
    // apprroach 2 iterative
    
    class Solution {
    public void flatten(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        if(root==null) return ;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
            if(!st.isEmpty()) curr.right=st.peek();
            curr.left=null;

        }
        
    }
    // approach 1 - dfs
    class Solution {
        TreeNode p = null;
        public void flatten(TreeNode root) {
            if(root==null) return;
            flatten(root.right);
            flatten(root.left);
    
            root.right=p;
            root.left=null;
            p=root;
        }
    }
}
}
