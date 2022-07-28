public class MainReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode cur = reverseLinkedList.reverseList(head);
        System.out.print("Reverse linked List is: ");
        while(cur != null) {
    System.out.print(cur.val);
    cur = cur.next;
}
    }
}
