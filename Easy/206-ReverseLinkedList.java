//  206. Reverse Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        //头结点为空或链表无数据
        if(head==null || head.next==null)
            return head;
        
        //p用来遍历链表
        ListNode p=head;
        ListNode newhead=null;
        ListNode tmp=null;
        while(p!=null){           
            tmp=p;            //临时结点存放p         
            p=p.next;         //当前结点后移
            tmp.next=newhead; //将临时结点插入新的表头
            newhead=tmp;      //newhead指向刚插入的结点
        }
		
        return newhead;
    }
	
	
}