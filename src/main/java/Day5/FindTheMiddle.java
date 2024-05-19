package org.example.Day5;

public class FindTheMiddle {

    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }

    public static Node findMiddle(Node head)
    {

        Node slow = head;
        Node fast = head;
        while((fast !=null && fast.next!=null) && slow != null)
        {
            slow = slow.next;
            fast  = fast.next.next;
        }
        return slow;
    }
}
