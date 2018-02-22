//  24. Swap Nodes in Pairs
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode p=head;
        ListNode tmp=head.next;
        ListNode tail=p;
        head=head.next;
        while(p!=null && p.next!=null){           
            p.next=tmp.next;
            tmp.next=p;
            tail=p;
            if(tail.next!=null && tail.next.next!=null){
                p=tail.next;
                tmp=p.next;
                tail.next=tmp;
            }else
                return head;
        }

        return head;
    }
}