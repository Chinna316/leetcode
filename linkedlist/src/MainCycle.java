/** Example 1:


 Input: head = [3,2,0,-4], pos = 1
 Output: true
 Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 *
 */
public class MainCycle {
    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = head.next;
        System.out.print(linkedListCycle.hasCycle(head));
    }
}
