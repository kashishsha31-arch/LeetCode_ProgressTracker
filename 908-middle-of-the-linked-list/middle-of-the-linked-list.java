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
    public ListNode middleNode(ListNode head) {
        //first solution
        //using length of linked list
        // int n=0;
        // ListNode tmp=head;
        // while(tmp!=null)
        // {
        //     n++;
        //     tmp=tmp.next;
        // }
        // int mid=n/2;
        // tmp=head;
        // while(mid>0)
        // {
        //         tmp=tmp.next;
        //         mid --;
        // }
        // return tmp;


        //OPTIMAL APPROACH FOR FINDING TRHE MIID OF LL
        //SLOW FAST POINTER APPROACH
        ListNode slow,fast;
        slow=head;
        fast=head;
        //slow will take one step and fast will take steps 
         while(fast!=null && fast.next!=null)
         {
            slow=slow.next;
            fast=fast.next.next;
         }
        return slow;
            }
}