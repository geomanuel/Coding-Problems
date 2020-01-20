/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        String binVal = "";
        while (current != null){
            binVal += current.val;
            current = current.next;
        }
        int decVal = Integer.parseInt(binVal,2);
        return decVal;
    }
}