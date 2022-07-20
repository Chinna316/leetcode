/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 *
 *
 * Example 1:Input: head = [1], n = 1
 * Output: []
 */


public class RemoveNthNodeFromEndOfList {
    public int removeNthFromEnd(ListNode head, int n) {
        ListNode h = head;
        ListNode r = head;
        int c = 0; // for counting the length of the list
        while(h != null) {
            c++;
            h = h.next;
        }
        h = head; // assigning head to its original
        if(c != n) {
            for(int i=1; i<=c-n; i++) {
                r = h; // assigning h to r , so that we can connect r next value to its next.next value
                h = h.next;
            }
            r.next = r.next.next;
            return h.val;
        }
        else {
            h = h.next;
        }
        return h.val;
    }
}
