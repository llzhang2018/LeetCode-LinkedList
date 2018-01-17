//  234. Palindrome Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        //空链表or只有一个元素返回true
        if(head==null || head.next==null) return true;
        
        //寻找链表的中点->快慢指针法（当快指针null时，慢指针到达中点）
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode p=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }       
        ListNode half=slow.next;//找到中点
        
        ListNode tail=ReverseList(half); //将后半个链表逆序
        ListNode q=tail;
        while(q!=null && p!=null){
            if(p.val == q.val){ //逐一比较对应数据域
                p=p.next;
                q=q.next;
            }else
                return false;
        }            
        return true;
    }
                
        //逆序操作，返回逆序后的头结点
    public ListNode ReverseList(ListNode head){
        
        if(head==null || head.next==null)
            return head;
        
        ListNode p=head;
        ListNode newhead=null;
        ListNode tmp=null;
        while(p!=null){           
            tmp=p;              
            p=p.next;
            tmp.next=newhead;
            newhead=tmp;
        }
        return newhead;
    }

}