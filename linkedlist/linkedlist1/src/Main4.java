/**
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 */

public class Main4 {
    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        System.out.print("Output: " + removeNthNodeFromEndOfList.removeNthFromEnd(head, n));
    }
}
