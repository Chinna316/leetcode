public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {

        ListNode temp = head;
        if(head == null)
            return null;
        while(temp.next != null) {
            ListNode temp1 = head;
            ListNode temp2 = temp.next;
            temp.next = temp.next.next;
            head = temp2;
            head.next = temp1;
        }
        return head;
    }
}
