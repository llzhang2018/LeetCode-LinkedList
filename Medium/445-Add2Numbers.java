// 445. Add Two Numbers II
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
		//将链表倒置，按照低位到高位的顺序计算
        ListNode p1=reverseList(l1);
        ListNode p2=reverseList(l2);
        ListNode newHead=null; //结果返回新链表，newHead为表头，需开辟新空间，复杂度O(n)
        int carry=0;//存放进位
        
        while(p1!=null || p2!=null){
			//遇到空结点按0计算
            int val1=p1!=null ? p1.val : 0;
            int val2=p2!=null ? p2.val : 0;   
			//按位求和，加上上一位的进位
            int sum=val1+val2+carry;
            int tmp=sum%10;//取个位
            carry=sum/10;  //取进位
			//申请新结点存放结果的个位，并插入新表表头
            ListNode p=new ListNode(tmp);
            p.next=newHead;
            newHead=p;
			//指针后移
            p1=p1!=null ? p1.next : null;
            p2=p2!=null ? p2.next : null;
        }
		//判断最高位有无进位
        if(carry!=0){
            ListNode p=new ListNode(carry);
            p.next=newHead;
            newHead=p;
        }
        return newHead;
        
    }
    //倒置链表时间O(n)
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode p=head;
        ListNode newHead=null;
        ListNode tmp=null;
        
        while(p!=null){
            tmp=p;
            p=p.next;
            tmp.next=newHead;
            newHead=tmp;
        }
        return newHead;
    }
}