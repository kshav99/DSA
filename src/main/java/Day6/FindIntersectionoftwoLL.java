package org.example.Day6;

import org.example.Day5.Node;

public class FindIntersectionoftwoLL {

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.data + " ");
            // Move to the next node
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Example Linked Lists
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(13);


        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        Node intersect = list2.next.next.next = new Node(16);
        list1.next.next.next = intersect;
        list2.next.next.next.next = new Node(17);

        System.out.print("First linked list: ");
        printLinkedList(list1);

        System.out.print("Second linked list: ");
        printLinkedList(list2);

        Node addedNumber = findIntersection(list1, list2);

        System.out.print("Final linked list: ");
        printLinkedList(addedNumber);
    }
    public static Node findIntersection(Node head1, Node head2)
    {
    Node d1 = head1;
    Node d2 = head2;
    while(d1!=d2)
    {
        d1 = d1 == null? head2:d1.next;
        d2 = d2 == null? head2:d2.next;
    }
        return d1;
    }
}
