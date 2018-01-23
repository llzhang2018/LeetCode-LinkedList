//  141. Linked List Cycle
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
    public boolean hasCycle(ListNode head) {
        
        if(head==null)return false;
        
        ListNode walker=head;//慢指针
        ListNode runner=head;//快指针
		
        //慢指针一次前进一步，快指针一次前进2步
		//当快慢指针相遇说明有环
        while(runner.next!=null&&runner.next.next!=null){
            walker=walker.next;
            runner=runner.next.next;
            if(walker==runner)
                return true;
        }
        
        return false;
    }
}