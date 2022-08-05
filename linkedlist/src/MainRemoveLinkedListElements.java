public class MainRemoveLinkedListElements {
    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        int val = 6;
        ListNode result = removeLinkedListElements.removeElements(head, val);
        System.out.print("Removed linked-list :");
        while(result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
