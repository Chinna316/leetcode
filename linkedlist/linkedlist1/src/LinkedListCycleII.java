/**
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        ListNode index = head;
        int t = 0;
        int c = 0;
        if(head == null || head.next == null){ // there would be no cycle if 1st values are null
            return null;
        }
        while(cur2 != null && cur2.next != null) { // until cur2 equals to null && if cur2.next is null then null.next is undefined
            cur1 = cur1.next;
            cur2 = cur2.next.next;
            if(cur1 == cur2) { // this proves there is cycle exists
                t = 1; // used for if- else conditions.
                break;
            }
        }
        if(t==1) {
            cur1 = head; // setting cur1 again to head, so that it will increment until equals to index where cur1 and cur2 equals.
            while(cur1 != cur2) {
                cur1 = cur1.next; // starts from head.
                cur2 = cur2.next; // continues from where cur1 and cur2 equals.
                c++; // used for counting incremented index
                if(cur2 == cur1)
                    index = cur1; // if cycle exists returning its index started from
            }
            System.out.println("index is :" + c); // printing index from where cycles starts
        }
        else
            return null;
        return index;
    }
}
