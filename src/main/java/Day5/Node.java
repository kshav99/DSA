package org.example.Day5;

public class Node {
    // Data stored in the node
    public int data;
    // Pointer to the next
    // node in the list
    public Node next;

    public Node child;

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data, Node next, Node child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }
    public Node()
    {

    }
    // Constructor with only data as
    // a parameter, sets next to null
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
