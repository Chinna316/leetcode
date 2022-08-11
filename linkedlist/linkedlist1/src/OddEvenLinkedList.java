/**
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 *
 * The first node is considered odd, and the second node is even, and so on.
 *
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 *
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 *
 *
 * Input: head = [2,1,3,5,6,4,7]
 * Output: [2,3,6,7,1,5,4]
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) // if head is null return null
            return null;
        ListNode temp = head; //1st value-> odd value
        ListNode temp1 = head.next; // odd next -> even value
        ListNode temp2 = head.next; // even value(to connect all odds to even)
        while(temp1 != null && temp1.next != null) { //(if there are 2 and more values exists)
            temp.next = temp1.next; // odd next value is next value of even
            temp = temp.next; // now odd value is next value of even
            temp1.next = temp.next; // even next value is current odd next value
            temp1 = temp1.next; // current even value is current odd next value
        }
        temp.next = temp2; // joining even values to odd values
        return head; // returning total head
    }
}
