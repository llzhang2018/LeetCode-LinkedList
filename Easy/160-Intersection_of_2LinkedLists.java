//  160. Intersection of Two Linked Lists
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)return null;
        ListNode a=headA;
        ListNode b=headB;
        int cntA=0,cntB=0;
        while(a!=null){//计算链表a的长度
            cntA++;
            a=a.next;
        }
        while(b!=null){//计算链表b的长度
            cntB++;
            b=b.next;
        }
        int res=0;
        res=Math.abs(cntA-cntB);
        a=headA;
        b=headB;
		//将较长的链表指针移动到res处，两个链表一同向后遍历
		//遇到相等的节点时返回，否则遍历结束返回null
        if(cntA>cntB){
            while(res>0){a=a.next;res--;}
            while(a!=b){a=a.next;b=b.next;}
            return a;
        }else if(cntA<cntB){
            while(res>0){b=b.next;res--;}
            while(a!=b){a=a.next;b=b.next;}
            return a;
        }else{
            while(a!=b){a=a.next;b=b.next;}
            return a;
        }     
    }
}