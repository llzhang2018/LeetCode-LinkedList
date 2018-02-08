//  328. Odd Even Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode odd=head;
        ListNode ehead=head.next;
        ListNode even=ehead;
        while(odd!=null && odd.next!=null && odd.next.next!=null){
            //断开偶结点的前驱
            odd.next=odd.next.next;
            odd=odd.next;
            //断开偶结点的后继
            even.next=odd.next;
            even=even.next;
            
        }
		//将偶结点拼接到末尾
        if(even==null)odd.next=ehead;//当odd.next==null
        else {//当odd.next.next==null
            even.next=null;
            odd.next=ehead;
        }
        
        return head;
    }
}