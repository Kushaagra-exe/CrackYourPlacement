class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node prev = null, head = null;
    void helper(Node root){
        if(root == null) return;
	    bToDLL(root.left);
	    if(prev==null) head = root;
	    else{
	        prev.right = root;
	        root.left = prev;
	    }
	    prev=root;
	    bToDLL(root.right);
    }
    Node bToDLL(Node root) {
	//  Your code here
	    helper(root);
	    return head;
    }
    
}