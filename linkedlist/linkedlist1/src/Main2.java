public class Main2 {
    public static void main(String[] args) {
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        System.out.print(linkedListCycleII.detectCycle(head));
    }
}