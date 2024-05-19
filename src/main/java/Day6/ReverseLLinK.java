package org.example.Day6;

import org.example.Day5.Node;

public class ReverseLLinK {
    public static void main(String[] args) {
        // Create a linked list with values 1, 3, 2, and 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        Node head2 = head.next.next.next = new Node(4);

        head2.next = new Node(5);
        head2.next.next = new Node(6);
        Node head3 = head2.next.next.next = new Node(7);

        head3.next = new Node(8);
        head3.next.next = new Node(9);
        Node head4 = head3.next.next.next = new Node(10);

        head4.next = new Node(11);
        head4.next.next = new Node(12);
        head4.next.next.next = new Node(13);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
//        head = reverseLinkedList(head);
        head = reverseLinkedListSizeK(head, 3);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node reverseLinkedListSizeK(Node head, int size)
    {
        Node current;
        Node next= null;
        current = head;
        Node prev = null;
        int i =0;
        while(current!=null && i < size)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            i++;
        }
        if (next != null) {
            head.next =
                    reverseLinkedListSizeK(next, size);
        }

        return prev;
    }
}
