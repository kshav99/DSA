package org.example.Day5;

public class RemoveNthNodefromBack {

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);

        // Delete the Nth node from the end and print the modified linked list
        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }

    public static Node DeleteNthNodefromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        int i = 1;
        while (i < n) {
            fast = fast.next;
            i++;
        }

        while (fast.next.next != null) {
            fast = fast.next;
            slow = slow.next;

        }
        Node temp = slow.next;
        slow.next = slow.next.next;
        temp = null;
        return head;
    }
}
