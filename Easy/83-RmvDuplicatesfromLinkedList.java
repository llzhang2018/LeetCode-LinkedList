//   83. Remove Duplicates from Sorted List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        //如果链表为空或只有一个元素，返回head
        if(head==null || head.next==null)return head;
        
        //有序链表：说明重复值只可能出现在相邻位置
        ListNode p=head;
        while(p!=null && p.next!=null){
            if(p.val==p.next.val)
                p.next=p.next.next;//跳过重复元素
            else
               p=p.next;
        }
        return head;
    }
}