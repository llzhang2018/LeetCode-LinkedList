//  143. Reorder List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
     if(head==null || head.next==null)return;
     ListNode fast=head.next;
     ListNode slow=head;
     ListNode half=null;
     //找到链表的中点
     while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
     }
        
    //反转后一半链表
     half=slow.next;
     slow.next=null;
     ListNode p=half;
     ListNode tmp=p;
     ListNode newhead=null;
     while(p!=null){
         tmp=p;
         p=p.next;
         tmp.next=newhead;
         newhead=tmp;
     }
        
    //插入前一半链表
     ListNode q=newhead;
     ListNode t=head;
     while(q!=null){
         tmp=q;
         q=q.next;
         tmp.next=t.next;
         t.next=tmp;
         t=t.next.next;
     }
        
    }
    
}