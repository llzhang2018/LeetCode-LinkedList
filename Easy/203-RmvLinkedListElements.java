//  203. Remove Linked List Elements
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode p = head;
        if(head==null)
            return null;
        while(p.next!=null){
            if(p.next.val==val)
                p.next=p.next.next;
            else
                p=p.next;
        }
        return head.val==val ? head.next : head;

        
        
    }
}