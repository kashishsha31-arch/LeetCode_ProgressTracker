/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

       
        //case if head is null
        if(head==null)return null;
        //case when only head is given and we want to reemove that  element
        if(head.next==null && head.val==val)
        {
        head=null; 
        return head;
        }
// traverse full ll o(n) 

        // applying one pointer logic
        
        ListNode dummy_node=new ListNode(-1);
        dummy_node.next=head;
        ListNode temp;
        temp=dummy_node;
        while(temp!=null && temp.next!=null)
        {
            
            if(temp.next.val==val)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }

        }
        return dummy_node.next;// main thing to be taken caree of
    }
}