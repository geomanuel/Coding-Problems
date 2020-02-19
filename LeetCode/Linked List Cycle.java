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
        if(head == null || head.next==null) return false;
        
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(head.next != null){
            if(set.contains(head)){
                return true;
            }
            else{
                set.add(head);
            }
            head = head.next;
        }
        return false;
    }
}