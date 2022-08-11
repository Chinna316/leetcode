/**
 * Input: head = [1,2,2,1]
 * Output: true
 */
public class MainPalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.print("Palindrome linked list :" + palindromeLinkedList.isPalindrome(head));
    }
}
