import org.w3c.dom.Node;

public class Deletenodeshavinggreatervalueonright {
    class Solution

{   
    
    Node rev(Node head){
        Node t = head, p=null;
        while(t!=null){
            Node n = t.next;
            t.next = p;
            p=t;
            t=n;
        }
        return p;
    }
    
    Node compute(Node head)
    {
        // your code here
        Node n =rev(head);
        Node t= n.next, p = n;
        int max = n.data;
        while(t!=null){
            if(t.data>=max){
                max= t.data;
                p=t;
                t=t.next;
            }else{
                p.next=t.next;
                t=t.next;
            }
        }
        head= rev(n);
        return head;
        
        
        
    }
}
  
}
