/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 *
 * Input: head = [1,2]
 * Output: false
 */

import java.util.ArrayList;
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        boolean result = true;
        ArrayList<Integer> val = new ArrayList(); // creating arraylist to add values from linked list
        ListNode cur = head;
        while(cur != null) {
            val.add(cur.val); // adding values
            cur = cur.next;
        }
        int first = 0; // first index
        int last = val.size()-1; // last index
        while(first < last) {
            if(!val.get(first).equals(val.get(last))) // if values not equal return false
                return false;
            else
                first++; // increment index from first
            last--; // decrement index from last
        }
        return result;
    }
}
