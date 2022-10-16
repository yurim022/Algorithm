/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    
        if(head == null || head.next == null) {
            return null;
        }
        
        ListNode slow=head,fast=head,checkpoint=head;
        while(fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) { //cycle exist
                
                while(slow != checkpoint) {
                    slow = slow.next;
                    checkpoint = checkpoint.next;
                }
                return checkpoint;
            }
        }
        
        return null; //no cycle exist
    }
}
