class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        while(head!= null && head.val == val) head= head.next;
        
        if(head == null) return head;
        
        ListNode t = head.next, p =head;
        while(t!=null){
            if(t.val==val) {
                p.next=t.next;
                t=t.next;
            }else{
                p=t;
                t=t.next;
            }
            
        }
        return head;

    }
}