package org.example.Day7;
import org.example.Day5.Node;

import java.util.HashMap;

public class CloneLLwithRandomPointer {
    static void printList(Node head) {
        while(head.next != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);

    }
    public static void main(String args[]) {
        Node head = null;

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        head = node1;
        head.next = node2;
        head.next.next = node3;
        head.next.next.next = node4;

        head.child = node4;
        head.next.child = node1;
        head.next.next.child = null;
        head.next.next.next.child = node2;

        System.out.println("Original list:(current node:node pointed by next pointer, node pointed by random pointer)");
        printList(head);

        System.out.println("Copy list:(current node:node pointed by next pointer,node pointed by random pointer)");
        Node newHead = copyRandomList(head);
        printList(newHead);
    }
    public static Node copyRandomList(Node head)
    {
        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (temp!=null)
        {
            Node newNode = new Node(temp.data);
            map.put(temp,newNode);
            temp= temp.next;
        }

        Node t= head;
        while (t!=null)
        {
            Node node = map.get(t);
            node.next = t.next!=null ? map.get(t.next) : null;
            node.child = t.child!=null ? map.get(t.child) : null;
            t = t.next;
        }

        return map.get(head);
    }
}



