/**
 * Input: head = [1,2,3,4,5]
 * Output: [1,3,5,2,4]
 */
public class MainOddEvenLinkedList {
    public static void main(String[] args) {
        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = oddEvenLinkedList.oddEvenList(head);
        System.out.print("Odd even linked list :");
        while(result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}
