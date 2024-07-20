class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode temp = head.next, prev = head;
        while(temp!=null){
            if(temp.val == prev.val){
                prev.next = temp.next;
                temp=temp.next;
            }else{
                prev = temp;
                temp= temp.next;
            }
        }
        return head;
    }
}