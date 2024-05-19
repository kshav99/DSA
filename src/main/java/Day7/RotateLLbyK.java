package org.example.Day7;
import org.example.Day5.Node;
public class RotateLLbyK {
    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Original list: ");
        printList(head);

        int k = 4;
        Node newHead = rotateRight(head,k);//calling function for rotating right

        System.out.println("After "+k+" iterations: ");
        printList(newHead);//list after rotating nodes

    }
    static void printList(Node head) {
        while(head.next != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println(head.data);

    }
    public static Node rotateRight(Node head, int k)
    {
        if(head == null || head.next == null || k == 0)
        {return head;}
        Node temp = head;
        int lenght = 1;

        while(temp.next!=null)
        {
            ++lenght;
            temp = temp.next;
        }
        temp.next=head;
        k = k%lenght;
        int end = lenght-k;
        while(end>0)
        {
            temp = temp.next;
            end --;
        }
        head =  temp.next;
        temp.next=null;
        return  head;
    }
}
