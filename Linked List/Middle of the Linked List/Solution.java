// Time Complexity: The time complexity is O(n)
// O(n) where n is the number of nodes in the linked list because we traverse the list with the fast and slow pointers.

// Space Complexity: The space complexity is O(1)
// O(1) because we only use a constant amount of space.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
                ListNode tortoise = head, hare = head;
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return tortoise;
    }
}