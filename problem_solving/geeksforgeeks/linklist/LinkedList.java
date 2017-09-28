package geeksforgeeks.linklist;

/**
 * Created by sourabh on 17/6/16.
 */
public class LinkedList {

    Node head;

    class Node {
        Integer value;
        Node next;

        Node(Integer value) {
            this.value = value;
            next = null;
        }
    }

    public void push(Integer value) {
        Node n = new Node(value);
        n.next = head;
        head = n;
    }

    public void pairSwap() {
        Node itr = head;
        for (; itr != null && itr.next != null; ) {
            Node temp = itr.next.next;
            itr.next.next = itr;
            itr.next = temp;
            itr = temp;
        }
    }

    public void print() {
        for (Node itr = head; itr != null; itr = itr.next) {
            System.out.println(itr.value);
        }
    }
}
