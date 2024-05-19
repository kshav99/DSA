package org.example.Day5;

public class AddtwoNumbers {
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
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("First linked list: ");
        printLinkedList(list1);

        System.out.print("Second linked list: ");
        printLinkedList(list2);

        Node addedNumber = addTwoNumber(list1, list2);

        System.out.print("Final linked list: ");
        printLinkedList(addedNumber);
    }

    public static Node addTwoNumber(Node list1, Node list2)
    {
    Node dummyNode = new Node();
    Node temp = dummyNode;
    int carry = 0;

    while(list1!=null || list2!=null || carry==1)
    {
        int sum = 0;
        if(list1!=null)
        {
            sum+=list1.data;
            list1 = list1.next;
        }
        if(list2!=null)
        {
            sum+=list2.data;
            list2 = list2.next;
        }
        sum +=carry;
        carry = sum/10;
        Node n = new Node(sum%10);
        temp.next = n;
        temp= temp.next;

    }

    return dummyNode.next;

    }
}
