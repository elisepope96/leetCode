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
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        int[] result = new int[10000000];
        int pos = 0;
        while (head != null){
            result[pos] = head.val;
            head = head.next;
            pos++;
        }
        ListNode front = new ListNode(result[pos - 1]);
        ListNode temp = new ListNode(result[pos - 2]);
        front.next = temp;
        for (int i = pos - 3; i >= 0; i--){
            temp.next = new ListNode(result[i]);
            temp = temp.next;
            
        }
        return front;
    }
}
