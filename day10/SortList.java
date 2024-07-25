package day10;

public class SortList {
    class Solution {
        public ListNode sortList(ListNode head) {
            if(head==null || head.next == null){
                return head;
            }
    
            ListNode mid = findMiddle(head);
            ListNode lhead = head;
            ListNode rhead = mid.next;
            mid.next = null;
            lhead = sortList(lhead);
            rhead = sortList(rhead);
    
            return mergeList(lhead, rhead);
             
    
        }
        public ListNode findMiddle(ListNode head){
            ListNode slow = head;
            ListNode fast = head.next;
            while(fast!= null && fast.next!=null){
                slow = slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    
        public ListNode mergeList(ListNode l1, ListNode l2){
            ListNode nh = new ListNode();
            if(l1.val < l2.val) {
                nh = l1;
                l1=l1.next;        
            }else {
                nh= l2;
                l2=l2.next;
            }
            ListNode temp = nh;
    
            while(l1!=null && l2!= null){
                if(l1.val< l2.val){
                    temp.next = l1;
                    l1 = l1.next;
                } else {
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp = temp.next;
            }
    
            if(l1!=null){
                temp.next = l1;
            }
            if(l2!=null){
                temp.next = l2;
            }
            return nh;
        }
    }
}
