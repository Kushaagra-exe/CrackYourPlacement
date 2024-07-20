import org.w3c.dom.Node;

public class Sortalinkedlistof0s1sand2s {
    class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        Node oneHead = new Node(-1);
        Node tHead = new Node(-1);
        Node zHead = new Node(-1);
        Node one = oneHead;
        Node two = tHead;
        Node zero = zHead;
        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                zero.next = temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next = temp;
                one=one.next;
            }
            else if(temp.data==2){
                two.next = temp;
                two=two.next;
            }
            temp=temp.next;
            
        }
        zero.next = (oneHead.next!=null)?oneHead.next:tHead.next;
        one.next = tHead.next;
        two.next = null;
        return zHead.next;
    }
    
    
}
}
