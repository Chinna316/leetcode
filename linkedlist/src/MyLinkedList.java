/** Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
 If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.


 *
 */
public class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if(index >= size || index < 0)
            return -1;
        ListNode cur = head.next;
        for(int i =0; i<index; i++)
            cur = cur.next;
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode cur = new ListNode(val);
        cur.next = head.next;
        head.next = cur;
        size++;
    }

    public void addAtTail(int val) {
        ListNode cur = head;
        ListNode temp = new ListNode(val);
        while(cur.next != null)
            cur = cur.next;
        cur.next = temp;
        size++;
    }


    public void addAtIndex(int index, int val) {
        ListNode cur = head;
        ListNode temp = new ListNode(val);
        if(index > size){
            return;
        }
        else{
            for(int i=0; i<index; i++) {
                cur = cur.next;
            }
            temp.next = cur.next;
            cur.next = temp;
            size++;}
    }

    public void deleteAtIndex(int index) {
        ListNode cur = head;
        if(index < 0 || index >= size){
            return;
        }
        else{
            for(int i=0; i<index; i++)
                cur = cur.next;
            cur.next = cur.next.next;
            size--;
        }
    }
}

