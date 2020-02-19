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
        
        if(head == null) return head;
        
        ListNode start = new ListNode(0);
        start.next = head;
        
        while(head.next != null){
            if (head.val == head.next.val){
                if(head.next.next != null){
                    head.next = head.next.next;
                    continue;
                }
                else {
                    head.next = null;
                    break;
                }
            }
            head = head.next;
        }
        
        return start.next;
    }
}