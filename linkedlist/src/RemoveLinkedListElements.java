public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        ListNode sentinal = new ListNode(0);
        sentinal.next = head;
        ListNode prev = sentinal;
        ListNode curr = head;
        while(curr != null) {
            if(curr.val == val)
                prev.next = curr.next;
            else
                prev = curr;
            curr = curr.next;
        }
        return sentinal.next;
    }
}
