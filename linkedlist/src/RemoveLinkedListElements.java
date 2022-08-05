/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 *
 * Input: head = [], val = 1
 * Output: []
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        ListNode sentinal = new ListNode(0); // head before listnode
        sentinal.next = head;
        ListNode prev = sentinal; // head before value
        ListNode curr = head; //current value
        while(curr != null) {
            if(curr.val == val)
                prev.next = curr.next; // skipping to next if current val equals to val
            else
                prev = curr;
            curr = curr.next; //going to next node
        }
        return sentinal.next; // total head assigned to sentinal.next
    }
}
