/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.

 There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

 Return true if there is a cycle in the linked list. Otherwise, return false.

 *
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        boolean result = false;
        while(cur2 != null && cur2.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
            if(cur1 == cur2) {
                result = true;
                return result;
            }
        }
        return result;
    }
}
