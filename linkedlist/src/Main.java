/** Input
 ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
 [[], [1], [3], [1, 2], [1], [1], [1]]
 Output
 [null, null, null, null, 2, null, 3]

 Explanation
 MyLinkedList myLinkedList = new MyLinkedList();
 myLinkedList.addAtHead(1);
 myLinkedList.addAtTail(3);
 myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
 myLinkedList.get(1);              // return 2
 myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
 myLinkedList.get(1);              // return 3
 *
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        System.out.print(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.print(myLinkedList.get(1));
    }
}
