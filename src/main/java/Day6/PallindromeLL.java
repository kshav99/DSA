package org.example.Day6;
import org.example.Day5.Node;
public class PallindromeLL {

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
       // head.next.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }



    public static boolean isPalindrome(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            fast =fast.next.next;
            slow = slow.next;
        }
        Node midPoint = slow;
        Node head2 = reverseLL(slow.next);
        slow = head;
        while(head2.next!=null){
            slow = slow.next;
            head2 = head2.next;
            if(slow.data != head2.data)
                return false;

        }
        return true;
    }
    public static Node reverseLL(Node head) {
        Node current;
        Node next = null;
        current = head;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
