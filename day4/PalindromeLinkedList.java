package day4;

public class PalindromeLinkedList {
    class Solution {
        ListNode reverse(ListNode head){
            ListNode temp = head, prev = null;
            while(temp!=null){
                ListNode next = temp.next;
                temp.next = prev;
                prev=temp;
                temp = next;
                
            }
            return prev;
        }
        public boolean isPalindrome(ListNode head) {
            ListNode fast=head, slow=head;
            while(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow = slow.next;
            }
            ListNode sec = reverse(slow.next);
            ListNode t1 = head, t2 = sec;
            while(t1!=null && t2!=null){
                if(t1.val!=t2.val) return false;
                t1= t1.next;
                t2=t2.next;
            }
            
    
            return true;
        }
        
    }
}
